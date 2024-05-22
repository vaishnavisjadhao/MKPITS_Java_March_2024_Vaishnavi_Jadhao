package collectiondemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class InterationExample {
    public static void main(String[] args) {
        //object of arraylist
        ArrayList arrayList = new ArrayList();
//
//      //add
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(60);
        arrayList.add(70);
//
//        //dispaly by iteration(object of iteration)
//        Iterator iterator = arrayList.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

        //---------traversing [ListIterator is a sub interface of iterator]
        // Java Program to traverse the list both in forward and backward direction using listIterator
        ListIterator listIterator = arrayList.listIterator();

        System.out.println("Forward Direction Iteration:");
        while (listIterator.hasNext()) {            //list from the start to the end
            System.out.println(listIterator.next());
        }

        System.out.println("Backward Direction Iteration:");
        while (listIterator.hasPrevious())      //backward from the end to the start
        {
            System.out.println(listIterator.previous());
        }



        //--------------------------removing array from collection
//        ArrayList<Integer> numbers = new ArrayList<Integer>();
//        numbers.add(12);
//        numbers.add(8);
//        numbers.add(2);
//        numbers.add(23);
//        Iterator<Integer> it = numbers.iterator();
//        while(it.hasNext()) {
//            Integer i = it.next();
//            if(i < 10) {
//                it.remove();
//            }
//        }
//        System.out.println(numbers);
//

    }
}
