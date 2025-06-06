package balaji;

import java.util.*;

class Student {
    String name;
    int age, grade;

    Student(String n, int a, int g) {
        name = n;
        age = a;
        grade = g;
    }
}

public class studentmanagementArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();

        System.out.println("Enter name, age, and grade of 5 students:");
        for (int i = 0; i < 3; i++) {
            String name = sc.next();
            int age = sc.nextInt();
            int grade = sc.nextInt();
            list.add(new Student(name, age, grade));
        }

        System.out.println("Students with grade above 80:");
        for (Student s : list) {
            if (s.grade > 80)
                System.out.println(s.name);
        }

        sc.close();
    }
}
