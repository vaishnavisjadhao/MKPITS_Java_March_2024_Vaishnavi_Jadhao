package may24;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Example {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(2);
        list.add(8);
        list.add(5);
        list.add(1);

        Iterator i = list.iterator();
        Collections.reverse(list);
        Collections.shuffle(list);
        i.next();
        i.remove();
        while(i.hasNext())
            System.out.print(i.next() + " ");
    }
    }
}
