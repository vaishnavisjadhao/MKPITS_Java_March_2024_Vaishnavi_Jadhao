package collectiondemo;

import java.util.ArrayList;

public class IntegerGenericExample {
    public static void main(String[] args) {
        int num = 5;
        ArrayList <Integer> arrayList = new ArrayList<Integer>(num);

        //Add element of arrayList
        arrayList.add(13);
        arrayList.add(55);
        arrayList.add(67);
        arrayList.add(87);

        //
        for (int i=0; i<arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        //printing arraylist
        System.out.println(arrayList);

    }
}
