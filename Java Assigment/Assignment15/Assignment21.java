package assignment;


import java.util.ArrayList;

//21. Write a Java program to replace the second element of an ArrayList with the specified element.
public class Assignment21 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(12);
        list1.add(24);
        list1.add(36);
        list1.add(48);
        list1.add(60);
        System.out.println(list1);

        list1.set(2,99);
        System.out.println("After replacing second element with 99: "+list1);
    }
}
