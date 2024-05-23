package linkedlist.ess;

import linkedlist.com.Customer;
import linkedlist.com.CustomerOrderManagement;

import java.util.Collections;
import java.util.LinkedList;

public class EventSchedulingSystem {
    LinkedList <Event> events = new LinkedList<>();
    public void addEvent(Event event){
        events.add(event);
        System.out.println("Task Added "+event);
    }

    public void removeEvent(int eventId) {
        events.removeIf(task -> task.getEventId()==(eventId));
        for (int i=0; i<events.size(); i++) {
            System.out.println(events.get(i));
        }
    }

    //main megthod---------------------------------
    public static void main(String[] args) {
        EventSchedulingSystem eventSystem = new EventSchedulingSystem();

        eventSystem.addEvent(new Event(1, "Party", "Nagpur", "12-4-2023", "7-PM"));
        eventSystem.addEvent(new Event(2, "Birthday Party", "Wardh", "20-4-2024", "3-PM"));
        eventSystem.addEvent(new Event(3, "Wedding", "Nagpur", "12-4-2023", "9-AM"));

        System.out.println("\nRemove Customer By Id 2");
        eventSystem.removeEvent(2);

    }

}
