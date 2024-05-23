package linkedlist.com;

import java.util.Collections;
import java.util.LinkedList;

public class CustomerOrderManagement {
    LinkedList <Customer> customers = new LinkedList<>();

    public void addCustomer(Customer customer){
        customers.add(customer);
        System.out.println("Task Added "+customer);
    }

    public void removeCustomer(int orderId) {
        customers.removeIf(task -> task.getOrderId()==(orderId));
        for (int i=0; i<customers.size(); i++) {
            System.out.println(customers.get(i));
        }
    }
    public void sortedByOrderDate() {
        Collections.sort(customers);
        for (Customer customer:customers){
            System.out.println(customer);
        }
    }

    //main megthod---------------------------------
    public static void main(String[] args) {
        CustomerOrderManagement customerOMng = new CustomerOrderManagement();

        customerOMng.addCustomer(new Customer(1, "Ram", "Laptop", 1,"22-4-2024"));
        customerOMng.addCustomer(new Customer(2, "Shyam", "Mobile", 3,"2-3-2023"));
        customerOMng.addCustomer(new Customer(3, "Gopal", "Mouse", 5,"22-4-2022"));

        System.out.println("\nRemove Customer By Id 2");
        customerOMng.removeCustomer(2);

        System.out.println("\n Sorted By Date");
        customerOMng.sortedByOrderDate();
    }
}
