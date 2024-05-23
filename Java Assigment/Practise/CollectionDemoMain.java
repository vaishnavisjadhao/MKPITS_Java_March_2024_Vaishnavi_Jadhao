package collectiondemo;

import stud.Student;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionDemoMain {
    public static void main(String[] args) {
        //object of arraylist
        ArrayList arrayList = new ArrayList();

//        add data in ArrayList(in the form of array)
        arrayList.add("one");
        arrayList.add("second");
        arrayList.add("3rd");
        arrayList.add("second"); // duplicate, is added

//        add integer type data in array list
        arrayList.add(4);
        arrayList.add(77);
        arrayList.add(5.6);


//        display list of array
        System.out.println(arrayList);

        //for display array list inone line
//        for(int i=0; i<arrayList.size(); i++) {
//            System.out.println(arrayList.get(i));
//        }

        //arraylist la obj navacha array madhe colect kela Ani tyla for each loop ne display kela
//        Object obj[] = arrayList.toArray();
//        for (Object o:obj){
//            System.out.println(o);
//        }

        //FOR EACH LOOP


//        METHODS OF ARRAY
        arrayList.isEmpty();
        arrayList.remove(3);  //remove array element on 3 position
        System.out.println("Size of array: " +arrayList.size());
        arrayList.get(5);  //show array element of 5 index number
        arrayList.add(0,"ram");
        System.out.println("index no of 4 element : "+arrayList.indexOf(4));//find the index no of particular element


        //convert name in uppercase
        System.out.println("convet string in uppercase: "+arrayList.get(3).toString().toUpperCase());

    }
}
