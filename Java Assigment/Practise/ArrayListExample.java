package collectiondemo;
import java.util.ArrayList;


public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList of String type (<String> it is a generic for store only string value)
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grapes");

        // Print the ArrayList
        System.out.println("Fruits List: " + fruits);

        // Access elements from the ArrayList
        String firstFruit = fruits.get(0);
        System.out.println("First fruit: " + firstFruit);

        // Modify an element in the ArrayList
        fruits.set(1, "Blueberry");
        System.out.println("Updated Fruits List: " + fruits);

        // Remove an element from the ArrayList
        fruits.remove(3);
        System.out.println("After removing an element: " + fruits);

        // Get the size of the ArrayList
        int size = fruits.size();
        System.out.println("Size of the ArrayList: " + size);

        // Iterate over the elements in the ArrayList
        System.out.println("Iterating over the elements:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
