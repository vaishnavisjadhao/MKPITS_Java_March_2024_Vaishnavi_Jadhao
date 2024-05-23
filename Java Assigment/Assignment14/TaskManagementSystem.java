package linkedlist.tms;

import java.util.Collections;
import java.util.LinkedList;

public class TaskManagementSystem {
    LinkedList <Task> tasks = new LinkedList<>();

    public void addTask(Task task){
        tasks.add(task);
        System.out.println("Task Added "+task);
    }

    public void removeTask(int taskId) {
        tasks.removeIf(task -> task.getTaskId()==(taskId));
        for (int i=0; i<tasks.size(); i++) {
            System.out.println(tasks.get(i));
        }
    }

    public void searchTaskBYId(int taskId) {
        for(Task task:tasks){
            if(task.getTaskId()==taskId) {
                System.out.println("Task Found:" +task);
                return;
            }
        }
        System.out.println("Task Id "+taskId+"is Not Found");
    }

    public void sortedByDueDate() {
        Collections.sort(tasks);
        for (Task task:tasks){
            System.out.println(task);
        }
    }

    //Main Method---------------------------------------------

    public static void main(String[] args) {
        TaskManagementSystem taskMS = new TaskManagementSystem();

        taskMS.addTask(new Task(1, "Update PC", "First", "25-4-2022"));
        taskMS.addTask(new Task(2, "Calculate Number", "Medium", "24-4-2022"));
        taskMS.addTask(new Task(3, "Update PC", "Last", "2-4-2022"));
        taskMS.addTask(new Task(4, "Update PC", "Last_Second", "23-4-2022"));

        System.out.println("\nRemove Task BY Id 2");
        taskMS.removeTask(2);

        System.out.println("\nSearchTask By Id is: 3");
        taskMS.searchTaskBYId(3);

        System.out.println("\nsorted By due date");
        taskMS.sortedByDueDate();
    }

}
