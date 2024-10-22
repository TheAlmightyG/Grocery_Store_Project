import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> items = new ArrayList<>();

    public void addItem(Product product) {
        items.add(product);
        System.out.println(product.getDetails() + " added to cart.");
    }

    public void removeItem(Product product) {
        items.remove(product);
        System.out.println(product.getDetails() + " removed from cart.");
    }

    public String displayCart() {
        StringBuilder cartDetails = new StringBuilder("Cart Contents:\n");
        for (Product item : items) {
            cartDetails.append(item.getDetails()).append("\n");
        }
        return cartDetails.toString();
    }

    public double getTotal() {
        double total = 0;
        for (Product item : items) {
            total += item.getPrice();
        }
        return total;
    }
}
