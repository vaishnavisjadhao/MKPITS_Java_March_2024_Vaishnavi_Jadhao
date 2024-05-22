package linkedlist;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack <Integer> stack = new Stack();
        //[20, 13, 89, 90, 11, 45]
        stack.push(20);
        stack.push(13);
        stack.push(89);
        stack.add(90);
        stack.add(11);
        stack.push(45);

        System.out.println(stack.peek());//return 45 but not remove it (LIFO)
        System.out.println(stack.empty()); //it check stack is empty or not
        System.out.println(stack.pop()); //45 is remove


        System.out.println(stack);
        for (int i=0; i<stack.size(); i++) {
            System.out.println(stack.get(i));
        }
    }
}
