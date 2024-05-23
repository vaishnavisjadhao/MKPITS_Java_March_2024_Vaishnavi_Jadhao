package numberStringExc;

//NumberFormatException
public class NumberFormatExceptionExample {
    public static void main(String[] args) {

        //        int a = Integer.parseInt(null);
        try {
            int a = Integer.parseInt(null);
        }
        catch (NumberFormatException e){
            System.out.println("Invalid String");
        }

    }
}
