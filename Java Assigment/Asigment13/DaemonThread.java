package threads_doemon;
// Implement a Java program that creates multiple threads, including one daemon thread. Each thread should perform a specific task.
// Observe the behavior of the daemon thread when the other threads finish execution.
public class DaemonThread extends  Thread{
    public DaemonThread(String name){
        super(name);
    }

    public void run() {
        // Checking whether the thread is Daemon or not
        if (Thread.currentThread().isDaemon()) {
            System.out.println(getName() + " is Daemon thread");
        } else {
            System.out.println(getName() + " is User thread");
        }
    }

    public static void main(String[] args) {
        DaemonThread thread = new DaemonThread("thread1");
        DaemonThread thread1 = new DaemonThread("thread2");
        DaemonThread thread2 = new DaemonThread("thread3");

        //setting user thread to daemon
        thread1.setDaemon(true);

        //start two thread
        thread.start();
        thread1.start();
        thread2.start();
    }

}
