package arraylists.cla;

import java.util.ArrayList;

public class ContactListApplication {
    ArrayList <Contact> contacts = new ArrayList<>();

    public void addContact(Contact contact) {
        contacts.add(contact);
        System.out.println("Contact Added: " +contact);
    }

    public void removeContact(int contactId) {
        contacts.removeIf(contact -> contact.getContactId()==contactId);
        for (int i=0; i<contacts.size(); i++) {
            System.out.println(contacts.get(i));
        }
    }

    public void searchContactByName (String name) {
        for (Contact contact:contacts) {
            if (contact.getName()==name) {
                System.out.println("Contact Found: " +contact);
                return;
            }
        }
        System.out.println("Contact with name "+name+ " Not Found");
    }

    //Main Methods----------------------------------
    public static void main(String[] args) {
        ContactListApplication contactLApp = new ContactListApplication();

        contactLApp.addContact(new Contact(1, "Vaishnavi Jadhao", 777609947, "vashojadhao@gmail.com"));
        contactLApp.addContact(new Contact(2, "Shyam deque", 438947598, "shyam@gmail.com"));
        contactLApp.addContact(new Contact(3, "Ram Pawar", 907439942, "ram23@gmail.com"));
        contactLApp.addContact(new Contact(4, "Bob Kharat", 868494744, "mohit123@gmail.com"));
        contactLApp.addContact(new Contact(5, "Geeta Phogat", 987734344, "geeta45@gmail.com"));

        System.out.println("\nRemove Contact By using Id is 3");
        contactLApp.removeContact(3);

        System.out.println("\nSearch Contact BY Using Name");
        contactLApp.searchContactByName("Geeta Phogat");

    }
}
