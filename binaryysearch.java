package balaji;

import java.util.Scanner;
import java.util.Arrays;

public class binaryysearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name to search:");
        String name = sc.nextLine();

        String[] names = {"Amit", "Divya", "Karan", "Priya", "Zoya"};

        
        Arrays.sort(names);

        
        int index = Arrays.binarySearch(names, name);

      
        if (index >= 0) {
            System.out.println(name + " found at index " + index + " in the sorted list.");
        } else {
            System.out.println(name + " not found in the list.");
        }

        sc.close();
    }
}
