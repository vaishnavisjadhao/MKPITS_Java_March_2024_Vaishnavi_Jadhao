package hotel;

//Create a program to handle total earning (like you want to create a application for hotel booking and suppose 10 rooms book on that day).
public class Booking extends Thread{
    private static int totalEarning = 0;

    private int bookingAmount;

//    Constructor
    public Booking(int bookingAmount) {
        this.bookingAmount = bookingAmount;
    }

    @Override
    //The run() method is overridden from the Thread class. Inside this method:
    public void run() {
        // synchronized block ensures that only one thread at a time runs
        synchronized (Booking.class) {
            //The booking amount is added to the totalEarning.
            totalEarning = bookingAmount + totalEarning;

            //Information about the current thread and the updated total earning is printed.
            System.out.println(Thread.currentThread().getName());
            System.out.println("Total Earning : $" +totalEarning);
        }
    }

    public static void main(String[] args) {

        //define number of rooms
        int numOfRooms = 10;

        //iterate number of loops 10 times
        for(int i=0; i<=numOfRooms; i++) {
            //Generates a random booking amount between 50 and 150.
            int bookingAmount = (int) (Math.random() * 100) + 50;
            Thread booking = new Booking(bookingAmount); //created new booking thread
            booking.start();
        }

    }

}







/*Overall, this program demonstrates a simple multi-threaded approach to simulate hotel bookings,
with each booking updating a shared total earning variable in a synchronized manner to avoid data
inconsistency issues.*/