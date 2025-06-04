package xyz;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoListApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> ob = new ArrayList<>();

        while (true) {
            System.out.println("\nSimple To-Do List App");
            System.out.println("1. Add a Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Delete a Task");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            if (choice == 1) {
                System.out.print("Enter the task: ");
                String task = sc.nextLine();
                ob.add(task);
                System.out.println("Task added successfully.");
            } else if (choice == 2) {
                if (ob.isEmpty()) {
                    System.out.println("No tasks found.");
                } else {
                    System.out.println("Your tasks:");
                    for (int i = 0; i < ob.size(); i++) {
                        System.out.println((i + 1) + ". " + ob.get(i));
                    }
                }
            } else if (choice == 3) {
                if (ob.isEmpty()) {
                    System.out.println("Nothing to delete.");
                } else {
                    System.out.println("Enter the task number to delete:");
                    for (int i = 0; i < ob.size(); i++) {
                        System.out.println((i + 1) + ". " + ob.get(i));
                    }

                    int tasknum = sc.nextInt();
                    sc.nextLine(); // consume newline

                    if (tasknum >= 1 && tasknum <= ob.size()) {
                        ob.remove(tasknum - 1);
                        System.out.println("Task deleted successfully.");
                    } else {
                        System.out.println("Invalid task number.");
                    }
                }
            } else if (choice == 4) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Please choose a valid option (1-4).");
            }
        }

        sc.close(); // correctly placed
    }
}
