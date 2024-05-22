package linkedlist;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector vector = new Vector();
//n+n/2+1 => 2+2/2+1 => 2+1+1 =4

        vector.add("Ram");
        vector.add("Geeta");
        vector.add("Jhon");
        vector.add("Bob");
        vector.add("Shyam");

//        vector.clear(); //delete all element from vector
        System.out.println(vector.contains("Bob"));  //return true if the vector contain specified element
        System.out.println(vector.elementAt(4));  //it find the element of specified index
        System.out.println(vector.get(4));  //elementAt() and get() both are same
        vector.ensureCapacity(25);  //increase capacity
        System.out.println(vector);

        System.out.println(vector.capacity());
        System.out.println("Size: " +vector.size());
    }
}
