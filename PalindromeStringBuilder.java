package balaji;

import java.util.*;

public class PalindromeStringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        // Using Stack
        Stack<Character> stack = new Stack<>();
        for (char c : word.toCharArray()) {
            stack.push(c);
        }

        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        if (word.equalsIgnoreCase(reversed)) {
            System.out.println("Using Stack: Palindrome ✅");
        } else {
            System.out.println("Using Stack: Not a Palindrome ❌");
        }

        // Using StringBuilder
        String reversed2 = new StringBuilder(word).reverse().toString();
        if (word.equalsIgnoreCase(reversed2)) {
            System.out.println("Using StringBuilder: Palindrome ✅");
        } else {
            System.out.println("Using StringBuilder: Not a Palindrome ❌");
        }

        sc.close();
    }
}
