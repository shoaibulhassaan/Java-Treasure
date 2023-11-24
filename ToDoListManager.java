import java.util.LinkedList;
import java.util.Scanner;

/*
 * @author Shoaib ul hassan
 * @email Shoaibulhassaan@gmail.com
 * @version 1.0
 * @since 2023-11-25
*/


class Task {
    String description;
    boolean isCompleted;

    Task(String description) {
        this.description = description;
        this.isCompleted = false;
    }
}

public class ToDoListManager {
    public static void main(String[] args) {
        LinkedList<Task> toDoList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("To-Do List Manager");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. Display Tasks");
            System.out.println("4. Quit");
            System.out.print("Enter your choice (1-4): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter task description: ");
                    String taskDescription = scanner.nextLine();
                    toDoList.add(new Task(taskDescription));
                    System.out.println("Task added successfully!");
                    break;
                case 2:
                    if (!toDoList.isEmpty()) {
                        System.out.println("Current Tasks:");
                        displayTasks(toDoList);
                        System.out.print("Enter the index of the task to remove: ");
                        int indexToRemove = scanner.nextInt();
                        if (indexToRemove >= 0 && indexToRemove < toDoList.size()) {
                            toDoList.remove(indexToRemove);
                            System.out.println("Task removed successfully!");
                        } else {
                            System.out.println("Invalid index. No task removed.");
                        }
                    } else {
                        System.out.println("No tasks to remove. The list is empty.");
                    }
                    break;
                case 3:
                    if (!toDoList.isEmpty()) {
                        System.out.println("Current Tasks:");
                        displayTasks(toDoList);
                    } else {
                        System.out.println("The to-do list is empty.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting To-Do List Manager. Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }

    private static void displayTasks(LinkedList<Task> tasks) {
        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);
            System.out.println((i + 1) + ". " + task.description + " - " +
                    (task.isCompleted ? "Completed" : "Not Completed"));
        }
    }
}
