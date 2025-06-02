package balaji;

import java.util.Scanner;

public class switchexample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter ");
		String Day=sc.nextLine().toLowerCase();
		switch(Day) {
		case "Sunday" :
			System.out.println("Lets run ruby");
			break;
		case "monday" :
			System.out.println("Lets run java");
			break;
		case "Tuesday" :
			System.out.println("Lets run python");
			break;
		case "wednesday" :
			System.out.println("Lets run c");
			break;
		default:
			System.out.println("invalid");
		}
		sc.close();
		// TODO Auto-generated method stub

	}

}
