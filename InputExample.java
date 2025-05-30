package balaji;

import java.util.Scanner;

public class InputExample {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age");
		int age=sc.nextInt();
		sc.nextLine();
		System.out.println("enter name");
		String name=sc.nextLine();
		System.out.println(name+age);
	}

}
