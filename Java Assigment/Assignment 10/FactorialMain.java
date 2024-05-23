import static Assignment2.SumofFactorialSeries.calculateSum;

public class FactorialMain {
    // Main driver method
    public static void main(String[] args)
    {
		/* No of terms in series
		taken inn order to show output */
        int N = 5;

        // Print sum of series by
        // calling function calculating sum of series
        System.out.println("The sum of series upto " + N
                + " terms is : "
                + calculateSum(N));
    }
}
