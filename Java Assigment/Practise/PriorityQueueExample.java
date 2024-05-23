package linkedlist;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();

        // Adding items to the pQueue using add()
        pQueue.add(10);
        pQueue.add(20);
        pQueue.add(35);
        pQueue.add(55);
        pQueue.add(3);

        //print
        System.out.println(pQueue);

//        System.out.println(pQueue.peek()); // Printing the top element of PriorityQueue
        System.out.println(pQueue.poll());  //remove and retrive the first element of queue
        System.out.println(pQueue.poll());

        //for use poll largest value in queue
        Comparator <Integer> comparator = Comparator.reverseOrder();


        System.out.println("Final PriorityQueue: "+pQueue);
    }
}
