package DropShipping;

import FileInputOutput.FileIO;

public class SalesManagement {
    private Sales[][] sales = new Sales[3][];

    //Constructors
    public SalesManagement() {
        this.sales[0] = FileIO.getSalesFromSuppliers("S1_Sales.csv","Customers.csv","S1_Products.csv");
        this.sales[1] = FileIO.getSalesFromSuppliers("S2_Sales.csv","Customers.csv","S2_Products.csv");
        this.sales[2] = FileIO.getSalesFromSuppliers("S3_Sales.csv","Customers.csv","S3_Products.csv");

    }

    //Getters and setters
    public Sales[][] getSales() {
        return sales;
    }

    public void setSales(Sales[][] sales) {
        this.sales = sales;
    }
}
