import java.util.Scanner;

class Student {
   
    int rollNo;
    String name;
    // TODO: Create a parameterized constructor Student(String name, int rollNo)
    System.out.println("Name: " + name + ", Roll No: " + rollNo);
    // TODO: Create a method or use direct access to print details in the required format
}

public class StudentClass {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         String name1 = sc.nextLine();
         int rollNo1 = sc.nextInt();

         String name2 = sc.nextLine();
         int rollNo2 = sc.nextInt();
        // TODO: Read name1
        // TODO: Read rollNo1
        // Hint: Handle the newline consumption if using nextLine() after nextInt()
        
        // TODO: Read name2
        // TODO: Read rollNo2
        Student student1 = new Student(name1, rollNo1);
        Student student2 = new Student(name2, rollNo2);
        // TODO: Create two Student objects
        System.out.println("Name: " + name1 + ", Roll No: " + rollNo1);
        System.out.println("Name: " + name2 + ", Roll No: " + rollNo2);
        // TODO: Print details for both students
    }
}
