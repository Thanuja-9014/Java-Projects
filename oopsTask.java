package balaji;

public class oopsTask {
    // Private fields
    private String name;
    private int rollNumber;
    private int marks;

    // Constructor
    public oopsTask(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for rollNumber
    public int getRollNumber() {
        return rollNumber;
    }
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    // Getter and Setter for marks
    public int getMarks() {
        return marks;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }

    // Method to check if student passed
    public boolean isPass() {
        return marks >= 40;
    }

    // Main method for testing
    public static void main(String[] args) {
        oopsTask student = new oopsTask("John", 101, 45);

        System.out.println("Name: " + student.getName());
        System.out.println("Roll Number: " + student.getRollNumber());
        System.out.println("Marks: " + student.getMarks());
        System.out.println("Result: " + (student.isPass() ? "Pass" : "Fail"));
    }
}
