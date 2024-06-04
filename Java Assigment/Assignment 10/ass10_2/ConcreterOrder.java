package onlineShoping;

import java.util.List;

public class ConcreterOrder implements  Order{
    private List<Product> products;

    public ConcreterOrder(List<Product> products){
        this.products = products;
    }

    @Override
    public double calculateTotal() {
        double total = 0;
        for (Product product : products){
            total += product.getPrice();
        }
        return total;
    }
}
