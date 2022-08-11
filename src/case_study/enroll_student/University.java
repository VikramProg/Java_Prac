package enroll_student;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class University {
    private String name;
    private String recognised_by;
    private String address;
    private int student_limit;
    private int courses_limit;
    private Registrar registrar;
    private ArrayList<Course> courses;
    private ArrayList<Student> students;

    Scanner sc = new Scanner(System.in);

    public University(String name, String recognised_by, String address, String registrar_name, int student_limit, int courses_limit) {
        this.name = name;
        this.recognised_by = recognised_by;
        this.address = address;
        this.student_limit = student_limit;
        this.courses_limit = courses_limit;
        this.registrar = new Registrar(registrar_name);
        this.students = new ArrayList<>(student_limit);
        this.courses = new ArrayList<>(courses_limit);
    }

    public void add_course(String course_name, int course_limit, int classRoom, int course_id) throws CourseLimitException {
        if (this.courses_limit > 0) {
            this.courses.add(new Course(course_name, course_id, classRoom, course_limit));
            courses_limit--;
        } else {
            throw new CourseLimitException("University courses limit reached!");
        }
    }

    public void getCourses() {
        System.out.print("[");
        for (Course obj : this.courses) {
            System.out.print(obj.getName() + ": " + obj.getLimit() + ", ");
        }
        System.out.println("]");
    }


    public void apply(String name, int age, double cgpa) throws StudentLimitException, IneligibleForAdmission {

        System.out.println("Student " + name + " is applying for " + this.name + " University.");

        if (this.student_limit > 0) {

            System.out.println(name + ", please wait our Registrar " + this.registrar.name + " is validating your application");

            boolean admission_status = this.registrar.verifyStudent(age, cgpa);

            if (admission_status) {

                System.out.println("Congrats " + name + " your application is verified by our registrar.");

                Course selected_course = get_selected_course();

                if (selected_course != null) {
                    try {
                        enrol_student(name, age, cgpa, selected_course);
                    }catch (CourseLimitException e) {
                        System.out.println(e.getMessage());
                    }
                } else {
                    System.out.println("Entered course not available.");
                }

            } else {
                throw new IneligibleForAdmission("Student not eligible");
            }

        } else {
            throw new StudentLimitException("sorry, currently no seats available!");
        }

    }

    private void enrol_student(String name, int age, double cgpa, Course course) throws CourseLimitException {

        int available_seats = course.getLimit();

        if (available_seats > 0) {

            int id = get_unique_id() - 10000;
            this.students.add(new Student(name, age, id, cgpa, 0.0d, course.getName()));
            course.setLimit(--available_seats);

            System.out.println("Student " + name + " is successfully added to " + course.getName() + ".\n Student id : " + id);

            this.student_limit--;

        } else {
            throw new CourseLimitException("No seats available for selected course");
        }
    }

    public void update_cgpa(int student_id, double cgpa) throws StudentNotFoundException {
        Student student_selected = get_student(student_id);
        if (student_selected != null) {
            int student_index = this.students.indexOf(student_selected);
            this.students.set(student_index, new Student(student_selected.getName(), student_selected.getAge(), student_selected.getId(), student_selected.getHighest_qualification_cgpa(), cgpa, student_selected.getCurrent_course()));
            System.out.println("Student details updated!");
        } else {
            throw new StudentNotFoundException("Student with id: " + student_id + " not found!");
        }

    }

    public void graduate(int student_id) throws StudentNotFoundException, IneligibleForGraduationException {
        Student student_selected = get_student(student_id);

        if (student_selected != null) {
            if (student_selected.getCurrent_cgpa() >= 6.0) {
                System.out.println("Congratulations and BRAVO! on your graduation.");
            } else {
                throw new IneligibleForGraduationException("Student not eligible for graduation");
            }
        } else {
            throw new StudentNotFoundException("Student not found!");
        }
    }


    private Course get_selected_course() {
        System.out.println("Enter Course name from below available list: ");
        System.out.print("[");
        for (Course obj : this.courses) {
            System.out.print(obj.getName() + ", ");
        }
        System.out.println("]");

        String choice = sc.next();

        for (Course obj1 : this.courses) {
            boolean found = obj1.getCourse(choice);
            if (found) {
                return obj1;
            }
        }
        return null;
    }

    private Student get_student(int id) {

        for (Student obj : this.students) {
            boolean found = obj.getStudent(id);
            if (found) {
                return obj;
            }
        }
        return null;
    }


    private int get_unique_id() {
        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyMMdd");
        //System.out.println(date);
        return Integer.parseInt(ft.format(dNow));
    }

}
