import java.util.List;

public class Aisle {
    private String aisleName;
    private List<Product> products;

    public Aisle(String aisleName, List<Product> products) {
        this.aisleName = aisleName;
        this.products = products;
    }

    public String getAisleName() {
        return aisleName;
    }

    public void displayProducts() {
        System.out.println("Products in " + aisleName + " Aisle:");
        for (Product product : products) {
            System.out.println(product.getDetails());
        }
    }
}
