package javaAssignments;

class Student {
    int id;
    String name;

    // Default Constructor
    Student() {
        id = 0;
        name = "Unknown";
        System.out.println("Default Constructor Called");
    }

    // Parameterized Constructor
    Student(int i, String n) {
        id = i;
        name = n;
        System.out.println("Parameterized Constructor Called");
    }

    // Method to display student details
    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {

        // Using Default Constructor
        Student s1 = new Student();
        s1.display();

        System.out.println();

        // Using Parameterized Constructor
        Student s2 = new Student(101, "Rahul");
        s2.display();
    }
}