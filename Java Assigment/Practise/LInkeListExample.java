package linkedlist;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//BY using queue Methods
public class LInkeListExample {
    public static void main(String[] args) {
//        LinkedList <Integer> list = new LinkedList<>();
        Queue <Integer> queue = new LinkedList<>();


//        list.add(12);
//        list.add(23);
//        list.add(54);
//        list.add(87);
//        list.add(76);

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
//        System.out.println(queue);

//        System.out.println(queue.peek()); //retrieve first element but doesnt remove
//         queue.peek();
//        System.out.println(list.poll());  //remove the head of the Que
//          queue.poll();
//        System.out.println(queue.offer(12)); //add at last
//          System.out.println(queue.remove());  //remove head of the queue
          System.out.println(queue.element()); //retrieve first element of queue
          System.out.println(queue);


    }
}
