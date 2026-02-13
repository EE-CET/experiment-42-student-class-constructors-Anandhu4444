import java.util.Scanner;

class Student {
    String name;
    int rollNo;

    // Parameterized Constructor
    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    // Method to display details
    void display() {
        System.out.println("Name: " + name + " Roll: " + rollNo);
    }
}

public class StudentClass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read student 1 details
        String name1 = sc.nextLine();
        int rollNo1 = sc.nextInt();
        sc.nextLine(); // consume newline

        // Read student 2 details
        String name2 = sc.nextLine();
        int rollNo2 = sc.nextInt();

        // Create objects
        Student s1 = new Student(name1, rollNo1);
        Student s2 = new Student(name2, rollNo2);

        // Print details
        s1.display();
        s2.display();

        sc.close();
    }
}
