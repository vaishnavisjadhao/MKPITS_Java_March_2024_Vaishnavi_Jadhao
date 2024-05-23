package threads;

public class YourClass extends Thread {
    public int sum = 0;
    public void run(){
//         synchronized block ensures that only one thread at a time runs
        synchronized (this) {
            for (int i = 0; i <= 50; i++) {
                sum = sum + i;
            }
        notify();

        }
//        System.out.println(sum);
    }
}
