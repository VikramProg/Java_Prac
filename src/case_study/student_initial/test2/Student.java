package student_initial.test2;

public class Student {

    String name;
    int age;
    String highest_qualification;
    String current_course;
    int id;
    double highest_qualification_cgpa;
    double current_cgpa;

    String current_university;

    public Student(String name, int age, String highest_qualification, String current_course, int id, double highest_qualification_cgpa) {
        this.name = name;
        this.age = age;
        this.highest_qualification = highest_qualification;
        this.current_course = current_course;
        this.id = id;
        this.highest_qualification_cgpa = highest_qualification_cgpa;
        this.current_cgpa = 0.0;
    }

    //public boolean update_student_details()
}
