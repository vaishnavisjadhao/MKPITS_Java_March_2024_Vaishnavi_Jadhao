package sleepMethod;

//Implement a Java program that creates a thread and makes it sleep using the sleep() method. Interrupt the thread during its sleep
// and handle the InterruptedException to gracefully exit the thread.
//Que
public class SleepThread extends  Thread{
    public void run(){
        for(int i=1; i<=5; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e){
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        SleepThread thread = new SleepThread();
        SleepThread thread1 = new SleepThread();
        thread.start();
        thread1.start();
    }
}
