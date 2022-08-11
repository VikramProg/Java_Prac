package student_initial.test2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        University university = new University("Jain student_initial.test2.University", "AICTE", "Lucknow", "Vijay Kumar");

        System.out.println("Enter student details for admission");

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Age: ");
        int age = sc.nextInt();

        System.out.print("Highest Qualification: ");
        String qualification = sc.next();

        System.out.print("Highest Qualification Cgpa: ");
        double cgpa = sc.nextDouble();

        System.out.print("Course applying for: ");
        String course = sc.next();

        String status = university.add_student(name, age, qualification, cgpa, course);

        System.out.println(status);

    }

}
