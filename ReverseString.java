package balaji;
import java.util.Scanner;
public class ReverseString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter String");
		String str=sc.nextLine();
		String rev="";
		int i=str.length()-1;
		while(i>=0) {
			rev=rev+str.charAt(i);
			i--;
		}
		System.out.println(rev);

		// TODO Auto-generated method stub

	}

}
