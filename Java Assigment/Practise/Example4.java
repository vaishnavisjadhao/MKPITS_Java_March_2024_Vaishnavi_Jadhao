package lambda_expression;

import java.util.ArrayList;

//Using Lambda Expression with collection
public class Example4 {
    public static void main(String[] args) {
        ArrayList <String> arrayList = new ArrayList<>(){{
           add("Bob");
           add("Ronit");
           add("Ram");
           add("John");
           add("jerry");
        }};
        // Using lambda expression to iterate through the list
        arrayList.forEach(name-> System.out.println(name));

        // Using lambda expression to filter and print names starting with 'J'
        arrayList.stream()
                .filter(name -> name.startsWith("J"))
                .forEach(name -> System.out.println("Name starting with J: " + name));
    }
}
