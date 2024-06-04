import onlineShoping.*;

import java.util.ArrayList;
import java.util.List;

public class OnlineShoppingSystem {
    public static void main(String[] args) {
//        Creating products
        Product product1 = new ConcreteProduct("Laptop", 1000.0, 5);
        Product product2 = new ConcreteProduct("Smartphone", 500.0, 10);

//        Creating a customer
        User customer = new Customer("John");

//        Adding product to cart
        Cart cart = new ShoppingCart();
        cart.addProduct(product1, 2);
        cart.addProduct(product2, 3);

//        Viewing cart
        cart.viewCart();

//        Creating an order
        List<Product> productsInOrder = new ArrayList<>(cart.cartItems.keySet());
        Order order = new ConcreterOrder(productsInOrder);

//        Calculating Total
        double total = order.calculateTotal();
        System.out.println("Total: $"+ total);
    }
}
