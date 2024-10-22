public class Product {
    private String productName;
    private double price;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public String getDetails() {
        return "Product: " + productName + ", Price: $" + price;
    }

    // Getter for price
    public double getPrice() {
        return price;
    }
}

