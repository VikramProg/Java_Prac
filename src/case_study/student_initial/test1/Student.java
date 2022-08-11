package student_initial.test;

public class Student {

    String name;
    int age;
    String highest_qualification;
    double highest_qualification_cgpa;

    public void apply(String name, int age, String qualification, double cgpa, University university) {

       university.add_student(name, age, qualification, cgpa);

    }
    //public boolean update_student_details()
}
