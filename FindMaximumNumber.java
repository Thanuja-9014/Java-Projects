package balaji;

import java.util.Scanner;

public class FindMaximumNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");

        // Take input and store in array
        for (int i = 0; i < 5; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        // Initialize max with the first element
        int max = numbers[0];

        // Find the maximum number
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // Print the maximum number
        System.out.println("The maximum number is: " + max);

        sc.close();
    }
}
