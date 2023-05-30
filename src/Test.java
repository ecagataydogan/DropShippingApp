import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
//        Customer[] allCustomer = FileIO.getAllCustomer("Customers.csv");
//        System.out.println(allCustomer);
//        for (Customer customer : allCustomer) {
//            System.out.println(customer);
//            System.out.println(customer.getName());
//        }

//        Product[] allProductsFromSupplier = FileIO.getProductsFromSupplier("S1_Products.csv");
//        System.out.println(allProductsFromSupplier);
//        for (Product product : allProductsFromSupplier) {
//            System.out.println(product);
//            System.out.println(product.getTitle());
//        }
//

//        Sales[] allSalesFromSupplier = FileIO.getSalesFromSuppliers("S3_Sales.csv","Customers.csv","S3_Products.csv");
//        for (Sales sales : allSalesFromSupplier) {
//            System.out.println(sales.getSalesPrice());
//        }

//        Supplier s1 = new Supplier("S1_Products.csv");
//        System.out.println(Arrays.toString(s1.getProducts()));




        //Get all customer data.
//        Customer[] allCustomers = FileIO.getAllCustomer(data);



        //Get products from specific supplier
//        Product[] products = FileIO.getProductsFromSupplier(data);
//        Supplier s1Products = new Supplier(products);
//        for (Product product : s1Products.getProducts()) {
//            System.out.println(product.getTitle());
//        }



        SalesManagement salesManagement = new SalesManagement();
//        System.out.println(Arrays.toString(salesManagement.getSales()));
        System.out.println(Arrays.toString(salesManagement.getSales()));

    }
}
