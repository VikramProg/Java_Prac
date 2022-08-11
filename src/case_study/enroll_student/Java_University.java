package case_study.enroll_student;

import java.util.Scanner;

public class Java_University {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        University university = new University("Java", "AICTE", "Lucknow", "Vijay Kumar", 2, 4);
        try {
            university.add_course("CSE", 1, 10, 105);
            university.add_course("EEE", 2, 11, 106);
            university.add_course("ECE", 3, 20, 107);
            university.add_course("ISE", 4, 10, 108);

            System.out.println("Courses Added!");

            university.getCourses();

        } catch (Exception ce) {
            System.out.println(ce.getMessage());
        }

        System.out.println("Enter student details for admission");

        System.out.print("Name: ");
        String name = sc.next();

        System.out.print("Age: ");
        int age = sc.nextInt();

//        System.out.print("Highest Qualification: ");
//        String qualification = sc.next();

        System.out.print("Highest Qualification Cgpa: ");
        double cgpa = sc.nextDouble();

        try {
            university.apply(name, age, cgpa);
            System.out.print("Enter student id for cgpa update: ");

            int student_id = sc.nextInt();
            university.update_cgpa(student_id, 6.0);

            System.out.print("Enter student id for graduating: ");
            student_id = sc.nextInt();
            university.graduate(student_id);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


}
