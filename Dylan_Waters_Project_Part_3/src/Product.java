public class Product {
    private String productName;
    private double price;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public String getDetails() {
        return productName + " - $" + String.format("%.2f", price);
    }

    public double getPrice() {
        return price;
    }

    public String getProductName() {
        return productName;
    }
}
