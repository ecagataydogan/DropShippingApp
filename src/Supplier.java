public class Supplier {
    private Product[] products;

    public Supplier(String fileName) {
        this.products = FileIO.getProductsFromSupplier(fileName);
    }
    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }
}
