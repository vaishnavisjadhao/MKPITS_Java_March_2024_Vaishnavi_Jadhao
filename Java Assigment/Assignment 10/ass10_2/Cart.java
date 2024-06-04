package onlineShoping;

public interface Cart {
    public void addProduct(Product product, int quantity);
    public void removeProduct(Product product);
    public void viewCart();
}

