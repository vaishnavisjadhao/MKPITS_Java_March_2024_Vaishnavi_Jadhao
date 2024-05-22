package linkedlist;

import java.util.ArrayDeque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        ArrayDeque <Integer> arrayDeque = new ArrayDeque<>();

        arrayDeque.add(12);
        arrayDeque.add(22);
        arrayDeque.add(56);
        arrayDeque.add(66);

        System.out.println(arrayDeque);

//        for (String str:arrayDeque) {
//            System.out.println(str);
//        }

        //Methods
//        System.out.println(arrayDeque.getFirst());  //Retrieve first element of deque
//        System.out.println(arrayDeque.poll());  //method returns head element and also removes it
        System.out.println(arrayDeque.offerFirst(88)); //add element at first
        System.out.println(arrayDeque.peek()); //return first element without removing it

        System.out.println("Final Deque: "+arrayDeque);
    }
}
