package DropShipping;

import FileInputOutput.FileIO;

public class Supplier {
    private Product[] products;

    //Constructor reads fileName and creates products array
    public Supplier(String fileName) {
        this.products = FileIO.getProductsFromSupplier(fileName);
    }

    //Getters and setters
    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }
}
