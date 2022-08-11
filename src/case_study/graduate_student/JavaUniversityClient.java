package case_study.graduate_student;

public class JavaUniversityClient {

    public static JavaUniversity university = JavaUniversity.getInstance();

    private static Student[] createStudents() {
        Student[] students = {
                new Student(1, "Gowrav", 7.5d),
                new Student(2, "Saurav", 5.5d),
                new Student(3, "Dhoni", 8.5d),
                new Student(4, "Virat", 3.5d),
                new Student(5, "Rohit", 9.5d),};
        try {
            for (Student st : students) {
                university.addStudent(st);
            }
        } catch (StudentLimitException se) {
            System.out.println(se.getMessage());
        }
        return students;
    }

    private static Course[] createCourses() {
        Course[] courses = {
                new Course(1, "Computer Science 101", 101),
                new Course(2, "Computer Science 102", 102),
                new Course(3, "Computer Science 103", 103),
                new Course(4, "Computer Science 104", 104),
                new Course(5, "Computer Science 105", 105),
        };
        try {
            for (Course c : courses) {
                university.addCourse(c);
            }
        } catch (CourseLimitException ce) {
            System.out.println(ce.getMessage());
        }
        return courses;
    }

    public static void main(String[] args) {
        Student[] students = createStudents();

        //getStudents() method displays all the students in the university
         university.getStudents();

        Course[] courses = createCourses();

        //getCourses() method displays all the courses in the university
        university.getCourses();

        //getGraduatedStudents() method displays all the graduatedStudents in the university
        university.getGraduatedStudents();

        try {

            //graduate() method if eligible graduate a student by removing that student from students[] array and adding that student to graduatedStudent[] arrayList
            // this block demonstrates the student graduation
            //university.getStudents();
            university.graduate(students[0]);
            university.graduate(students[2]);
            university.getGraduatedStudents();
            //university.getStudents();


            //enrolCourse() method adds the given course to student courses[] array, maximum 5 are added, adding 6th will result in StudentCourseLimitException
            /* this block demonstrates the student enrolling for given course
            university.enrolCourse(students[1],courses[0]);
            university.enrolCourse(students[1],courses[1]);
            university.enrolCourse(students[1],courses[2]);
            university.enrolCourse(students[1],courses[3]);
            university.enrolCourse(students[1],courses[4]);
            university.getStudents();
             */

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
