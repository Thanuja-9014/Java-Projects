package balaji;

import java.util.LinkedList;
import java.util.Scanner;

public class studentLinkedList {
	public static void main(String[] args)
	{
		LinkedList<String> stu=new LinkedList<String>();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter names of 5 students");
		
		for(int i=0;i<=5;i++) {
			System.out.println("enter the names of students" + i +"");
			String name=sc.nextLine();
			stu.add(name);
		}
		System.out.println("student names are");
		for(String student:stu) {
			System.out.println(student);
		}
	}

}
