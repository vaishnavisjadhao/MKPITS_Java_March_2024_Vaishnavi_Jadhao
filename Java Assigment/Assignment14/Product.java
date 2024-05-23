package arraylists.ims;

import arraylists.sms.Student;

public class Product implements Comparable<Product>{
    private int productId;
    private String name;
    private int quantity;
    private double price;

    public Product(int productId, String nmae, int quantity, double price) {
        this.productId = productId;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int compareTo(Product prd) {
        if(price==(prd).price)
            return 0;
        else if(price > (prd).price)
            return  1;
        else
            return  -1;
    }
}
