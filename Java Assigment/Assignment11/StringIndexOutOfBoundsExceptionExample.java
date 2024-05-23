package numberStringExc;

//StringOut Of Bond Exception
public class StringIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        String str = "Hello";
        try {
            char result = str.charAt(5);
            System.out.println(result);
        }
        catch (StringIndexOutOfBoundsException e){
            System.out.println("String is not found at that index");
        }
    }
}
