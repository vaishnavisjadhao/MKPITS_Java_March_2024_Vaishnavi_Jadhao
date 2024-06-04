package onlineShoping;

public class ConcreteProduct implements Product{
    private String name;
    private  double price;
    private int quantity;

    //    Constructor
    public ConcreteProduct(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

//    override the method of product
    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }
}
