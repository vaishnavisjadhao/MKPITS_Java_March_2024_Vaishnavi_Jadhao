package assignment;

import java.util.TreeMap;

public class SortedContactList {
   TreeMap <String, Integer> treeMap = new TreeMap<>();

   //add contact name and phone no
    public void addContactList(String contactName, Integer phoneNo){
        treeMap.put(contactName, phoneNo);
        System.out.println(treeMap.entrySet());
    }

    //update contactList
    public void updateContact(String contactName, Integer phoneNo) {
        treeMap.put(contactName, phoneNo);
        System.out.println("\nAfter updated list: "+treeMap.entrySet());
    }

    //retrieve contact


    //display
    public void displayContactList() {
        if(treeMap.isEmpty()){
            System.out.println("Contact are Not Available");
        }
        else {
            System.out.println("\nDispaly contact by grades Grades");
            for (Integer no : treeMap.values()) {
                System.out.println(no);
            }
        }
    }

    //delete
    public void deleteContact() {
        System.out.println("Delete contact by key(Bob)");
        treeMap.remove("Bob");
        System.out.println(treeMap.entrySet());
    }

//    Main Method----------------
    public static void main(String[] args) {
        SortedContactList sortedContactList = new SortedContactList();

        //add
        sortedContactList.addContactList("Ram", 938448957);
        sortedContactList.addContactList("Shyam", 839397343);
        sortedContactList.addContactList("Gopal", 967846594);
        sortedContactList.addContactList("Geeta", 84759349);

        //update
        sortedContactList.updateContact("Bob", 986047472);

        //delete
        sortedContactList.deleteContact();

        //display
        sortedContactList.displayContactList();
    }
}
