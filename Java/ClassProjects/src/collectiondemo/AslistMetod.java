package collectiondemo;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class AslistMetod {
    public static void main(String[] args) {
        //initialize array through aslist method of arrays class
        //initialising list using list return by aslist() method of arrays class
        List<Integer> list = Arrays.asList(23,45,67,89,67,54);

        //display or print in the for of arrays
        System.out.println(list);

        //Display by iterator [in the form of one after another]
        Iterator iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //Passing another collection through constructor of arraylist
        ArrayList <Integer> arrayList = new ArrayList<>(list);
        System.out.println(arrayList);

//        initialising array list using double braces (anonymous inner class)
        ArrayList<Integer> arrayList1 = new ArrayList<>(list){{
            arrayList.add(12);
            arrayList.add(23);
            arrayList.add(43);
        }};
    }
}
