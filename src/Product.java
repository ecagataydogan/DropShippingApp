public class Product {
    private String id;
    private String title;
    private double rate;
    private double numberOfReviews;
    private double price;

    public Product() {
        this("empty","empty",0d,0d,0d);
    }

    public Product(String id, String title, double rate, double numberOfReviews, double price) {
        this.id = id;
        this.title = title;
        this.rate = rate;
        this.numberOfReviews = numberOfReviews;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getNumberOfReviews() {
        return numberOfReviews;
    }

    public void setNumberOfReviews(double numberOfReviews) {
        this.numberOfReviews = numberOfReviews;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
