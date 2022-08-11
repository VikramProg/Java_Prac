package case_study.student_initial.test1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        University university = new University("Jain University", "AICTE", "Lucknow", "Vijay Kumar");

        System.out.println("Enter student details for admission");

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Age: ");
        int age = sc.nextInt();

        System.out.print("Highest Qualification: ");
        String qualification = sc.next();

        System.out.print("Highest Qualification Cgpa: ");
        double cgpa = sc.nextDouble();

        Student student = new Student();
        student.apply(name, age, qualification, cgpa, university);



    }

}
