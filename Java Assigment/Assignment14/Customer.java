package linkedlist.com;

public class Customer implements Comparable <Customer>{
    //`orderId`, `customerName`, `product`, `quantity`, and `orderDate
    private int orderId;
    private String customerName;
    private String product;
    private int quantity;
    private String orderDate;

    public Customer(int orderId, String customerName, String product, int quantity, String orderDate) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.product = product;
        this.quantity = quantity;
        this.orderDate = orderDate;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getOrderDate() {
        return orderDate;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "orderId=" + orderId +
                ", customerName='" + customerName + '\'' +
                ", product='" + product + '\'' +
                ", quantity=" + quantity +
                ", orderDate='" + orderDate + '\'' +
                '}';
    }

    @Override
    public int compareTo(Customer customer) {
        return orderDate.compareTo((customer).orderDate);

    }
}
