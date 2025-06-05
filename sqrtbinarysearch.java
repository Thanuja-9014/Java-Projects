package balaji;
import java.util.Scanner;

public class sqrtbinarysearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int n = sc.nextInt();

        int result = integerSquareRoot(n);
        System.out.println("Integer part of square root of " + n + " is: " + result);

        sc.close();
    }

    
    public static int integerSquareRoot(int n) {
        if (n == 0 || n == 1) return n;

        int start = 1, end = n, ans = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            long square = (long) mid * mid;

            if (square == n) {
                return mid;
            } else if (square < n) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return ans;
    }
}
