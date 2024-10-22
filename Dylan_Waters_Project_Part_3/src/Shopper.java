public class Shopper {
    private Cart cart;

    public Shopper() {
        this.cart = new Cart();
    }

    public void browseStore(Store store) {
        System.out.println("Browsing the store...");
        store.displayAisles();
    }

    public void checkout(Store store) {
        store.checkout(cart);
    }

    public Cart getCart() {
        return cart;
    }
}
