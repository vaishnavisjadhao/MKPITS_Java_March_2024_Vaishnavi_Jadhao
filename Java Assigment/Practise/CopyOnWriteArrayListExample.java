package may23;

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample {
    public static void main(String[] args) {
        CopyOnWriteArrayList <Integer> copyList = new CopyOnWriteArrayList<>();

        copyList.add(24);
        copyList.add(24);
        copyList.add(24);
        copyList.add(24);
        copyList.add(24);
        copyList.add(24);
    }
}
