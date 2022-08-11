package case_study.graduate_student;

public class Student {
    private final int id;
    private String name;
    private double gpa;
    private int courseCount = 0;
    private Course[] courses;

    public Student(int id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
        this.courses = new Course[5];
    }
    public int getCourseCount() {
        return courseCount;
    }

    public double getGpa() {
        return gpa;
    }

    //this method displays all courses student enrolled for
    public Course[] getCourses() {
        return courses;
    }

    //this method add course to student course array, maximum 5 are added
    public void addCourse(Course course) {
        courses[courseCount] = course;
        courseCount++;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Gpa: " + gpa + ", Courses enrolled: " + courseCount;
    }

}

