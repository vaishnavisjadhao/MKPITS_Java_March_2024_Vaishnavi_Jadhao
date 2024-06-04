package assignment;

import java.util.Comparator;
import java.util.Dictionary;
import java.util.Map;
import java.util.TreeMap;

public class CaseInsensitiveDictionary {
    TreeMap <String, String> treeMap = new TreeMap<>(new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            return o1.compareToIgnoreCase(o2);
        }
    });

    //add
    public void addWord(String word, String definition) {
        treeMap.put(word, definition);
        System.out.println(treeMap.entrySet());
    }

    //update
    public void update(String word, String definition) {
        System.out.println("\nUpdate dictionary");
        treeMap.put(word, definition);
        System.out.println("After updated dictionary:"+treeMap.entrySet());
    }

    //delete
    public void delete() {
        System.out.println("\nDelete key(Backup)");
        treeMap.remove("Backup");
        System.out.println("After Deleting : "+treeMap.entrySet());
    }

    //retrieve
    public String getDefinition(String word) {
        System.out.println("\nretrieve dictionary");
        if (treeMap.containsKey(word)) {
            return treeMap.get(word);
        } else {
            System.out.println("Word not found: " + word);
            return null;
        }
    }

    //display
    public void display() {
        System.out.println("\ndisplay dictionary");
        for (Map.Entry<String, String> s:treeMap.entrySet()) {
            System.out.println(s);
        }
    }

    //Main Method-------------------------------------------
    public static void main(String[] args) {
        CaseInsensitiveDictionary dictionary = new CaseInsensitiveDictionary();

        //add
        dictionary.addWord("Beside", "next to");
        dictionary.addWord("Backup", "help or support");
        dictionary.addWord("Cast", "register");
        dictionary.addWord("Delete", "remove");
        dictionary.addWord("Fabulous", "extraordinary");

        //update
        dictionary.update("Gorgeous", "very attractive");

        //delete
        dictionary.delete();

        //re
        dictionary.getDefinition("Cast");
        System.out.println(dictionary.treeMap.entrySet());

        //display
        dictionary.display();
    }

}
