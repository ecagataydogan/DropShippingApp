public class Sales {
    private String id;
    private Customer customer;
    private Product product;
    private String salesDate;
    private double salesPrice;

    public Sales() {
        this("empty",null,null,"empty");
    }

    public Sales(String id, Customer customer, Product product, String salesDate) {
        this.id = id;
        this.customer = customer;
        this.product = product;
        this.salesDate = salesDate;
        this.salesPrice = calculateSalesPrice();
    }

    //product.getPrice() + (product.getRate()*20.0) * product.getNumberOfReviews();
    private  double calculateSalesPrice() {
        return this.product.getPrice() + (this.product.getRate() * 20.0) * this.product.getNumberOfReviews();
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getSalesDate() {
        return salesDate;
    }

    public void setSalesDate(String salesDate) {
        this.salesDate = salesDate;
    }

    public double getSalesPrice() {
        return this.salesPrice;
    }

    public void setSalesPrice(double salesPrice) {
        this.salesPrice = salesPrice;
    }

    public double calculateProfit() {
        return this.salesPrice - this.product.getPrice();
    }
}
