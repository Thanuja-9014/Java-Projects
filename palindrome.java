package balaji;
import java.util.Scanner;
public class palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int original=sc.nextInt();
		int rev=0;
		int n=original;
		while(n!=0) {
			int digit=n%10;
			rev=rev*10+digit;
			n=n/10;
		}
		if(original==rev) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
		sc.close();
		// TODO Auto-generated method stub

	}

}
