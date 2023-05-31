package FileInputOutput;

import DropShipping.Customer;
import DropShipping.Product;
import DropShipping.Sales;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class FileIO {

    //It reads data from spesicif file. Returns string array.
    private static String[] getData(String fileName) {
        Scanner scanner = null;
        int lineNumber = lineCalculator(fileName);
        String[] data = new String[lineNumber];
        try {
            scanner = new Scanner(new File(fileName));
            scanner.nextLine();// ID,Name,Email,Country,Address line ı atlamak için
            int index = 0;
            while(scanner.hasNext()) {
                data[index] = scanner.nextLine();
                index++;
            }

        } catch (FileNotFoundException e){
            System.out.println(fileName + " not found");
        }
        return data;
    }

    //Reads data from file, creates DropShipping.Customer objects and returns DropShipping.Customer array (all customers)
    public static Customer[]  getAllCustomer(String fileName) {
        String[] data = getData(fileName);
        Customer[] allCustomers = new Customer[data.length];
        int index = 0;
        for (String customerStr : data) {
            String[] customerArr = customerStr.split(",");
            String id = customerArr[0];
            String name = customerArr[1];
            String email = customerArr[2];
            String country = customerArr[3];
            String address = customerArr [4];
            allCustomers[index] = new Customer(id,name,email,country,address);
            index++;
        }
        return allCustomers;
    }

    //Reads data from file, creates product objects and returns DropShipping.Product array (Specific supplier)
    public static Product[]  getProductsFromSupplier(String fileName) {
        String[] data = getData(fileName);
        Product[] products = new Product[data.length];
        int index = 0;
        for (String productStr : data) {
            String[] productArr = productStr.split(",");
            String id = productArr[0];
            String title = productArr[1];
            double rate = Double.parseDouble(productArr[2]);
            double numberOfReviews = Double.parseDouble(productArr[3]);
            double price = Double.parseDouble(productArr[4]);
            products[index] = new Product(id,title,rate,numberOfReviews,price);
            index++;
        }
        return products;
    }

    //Reads data from files, create sales, returns DropShipping.Sales array (Specific sales ie.s1,s2,s3)
    public static Sales[] getSalesFromSuppliers(String salesFileName, String customersFileName, String productsFileName) {
        String[] data = getData(salesFileName);
        Sales[] sales = new Sales[data.length];
        int index = 0;
        for (String salesStr : data) {
            String[] salesArr = salesStr.split(",");
            String id = salesArr[0];
            String customerId = salesArr[1];
            Customer customerObject = getCustomerById(customersFileName,customerId);
            String productId = salesArr[2];
            Product productObject = getProductById(productsFileName,productId);
            String salesDate = salesArr[3];
            sales[index] = new Sales(id,customerObject,productObject,salesDate);
            index++;
        }
        return sales;

    }

    //HELPER METHODS

    private static Product getProductById(String productsFileName, String productId) {
        Product[] allProducts = getProductsFromSupplier(productsFileName);
        for(Product product : allProducts) {
            if(product.getId().equals(productId)) {
                return product;
            }
        }
        return null;
    }

    private static Customer getCustomerById(String fileName, String customerId) {
        Customer[] allCustomers = getAllCustomer(fileName);
        for(Customer customer : allCustomers) {
            if(customer.getId().equals(customerId)) {
                return customer;
            }
        }
        return null;
    }

    //Calculates line number
    private static int lineCalculator(String fileName) {
        int lineNumber = 0;
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(fileName));
            while (scanner.hasNext()) {
                scanner.nextLine();
                lineNumber++;
            }
        } catch (FileNotFoundException e) {
        }
        return lineNumber != 0 ? lineNumber - 1 : 0; //ID,Name,Email,Country,Address line ı satır sayısından düşmek için
    }
}



