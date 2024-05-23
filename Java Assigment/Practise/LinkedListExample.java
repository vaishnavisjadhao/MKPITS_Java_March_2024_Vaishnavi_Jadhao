package linkedlist;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        //object
        LinkedList linkedList = new LinkedList();

        //add values
        linkedList.add("Ram");
        linkedList.add("Shine");
        linkedList.addFirst("Bright");
        linkedList.addFirst("linkedlist");
        linkedList.addLast("Mohit");

        //print linkedlist
        System.out.println(linkedList);

        //display by for linked list
//        for(int i=0; i<linkedList.size(); i++){
//            System.out.println(linkedList.get(i));
//        }

        //display by for each loop
//        for (Object o:linkedList){
//            System.out.println(o);
//        }

        //Methods
        linkedList.getFirst(); //return the first element in the list

    }
}
