package enroll_student;

public class Student {

    private String name;
    private int age;
    private int id;
    private double highest_qualification_cgpa;
    private double current_cgpa;
    private String current_course;

    public Student(String name, int age, int id, double highest_qualification_cgpa, double current_cgpa, String current_course) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.highest_qualification_cgpa = highest_qualification_cgpa;
        this.current_cgpa = current_cgpa;
        this.current_course = current_course;
    }

    public String getCurrent_course() {
        return current_course;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public double getHighest_qualification_cgpa() {
        return highest_qualification_cgpa;
    }

    public double getCurrent_cgpa() {
        return current_cgpa;
    }


    public void setCurrent_cgpa(double current_cgpa) {
        this.current_cgpa = current_cgpa;
    }

    public boolean getStudent(int id) {
        return this.getId() == id;
    }
}
