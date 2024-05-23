package bank;

public class BankTest {

    public static void main(String[] args) {

        Customer customer = new Customer();

        new Thread() {
            public void run() {
                customer.withdraw(15000);
            }
        }.start();

        new Thread() {
            public void run() {
                customer.deposit(1000);
            }
        }.start();
    }
}
