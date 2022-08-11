package case_study.graduate_student;

import java.util.ArrayList;

public class JavaUniversity {
 
    private final int STUDENT_LIMIT = 5;
    private final int COURSE_LIMIT = 5;
    private final double MIN_GRADUATION_GPA = 7.0d;

    private static JavaUniversity jUniversity;
 
    private Student[] students;//this array contains all students who are not graduated yet
    private Course[] courses;
    private ArrayList<Student> graduatedStudents;//this contains all graduated students from the university
    private int courseCount = 0;
    private int studentCount = 0;
 
    private JavaUniversity() {
        this.students = new Student[STUDENT_LIMIT];
        this.courses = new Course[COURSE_LIMIT];
        this.graduatedStudents = new ArrayList<Student>();
    }
 
    public static JavaUniversity getInstance(){
        return  new JavaUniversity();
    }

    public void addCourse(Course c)throws CourseLimitException {
        if(courseCount < COURSE_LIMIT){
            this.courses[courseCount] = c;
            ++courseCount;
        }else{
           throw  new CourseLimitException("University Course limit reached !!!!");
        }
    }

     public void addStudent(Student st)throws StudentLimitException {
        if(studentCount < STUDENT_LIMIT){
            this.students[studentCount] = st;
            ++studentCount;
        }else{
           throw  new StudentLimitException("University Student limit reached !!!!");
        }
    }

    //this method displays all the available courses in the univeristy
    public void getCourses(){
        System.out.println("----JavaUniversity courses ----");
        for(Course c: courses){
            System.out.println(c);
        }
        System.out.println("-------------------------------------------------------");
    }

    //this method displays all the students in the university who or not yet graduated
    public void getStudents(){
        System.out.println("----JavaUniversity students ----");
        for(int i=0; i<studentCount; i++){
            System.out.println(students[i]);
        }
        System.out.println("-------------------------------------------------------");
    }

    //this method displays all the graduated students from university
    public void getGraduatedStudents(){
        System.out.println("----JavaUniversity graduated students ----");
        for(Student s: graduatedStudents){
            System.out.println(s);
        }
        System.out.println("-------------------------------------------------------");
    }

     public void graduate(Student st)throws StudentNotFoundException, IneligibleForGraduationException {
        int index = checkStudent(st);
    	 if(index >= 0) {
    		 if(students[index].getGpa() >= this.MIN_GRADUATION_GPA) {
    			 System.out.println("Congrats on Graduation");
                 graduatedStudents.add(students[index]);
                 manageStudents(index);
    		 }
    		 else {
    			 throw new IneligibleForGraduationException("Not eligible for graduation.");
    		 }
    	 }
    	 else {
    		 throw new StudentNotFoundException("Student not found!");
    	 }
     }

     //this method adds given course to student course array on successful passing all the conditions
     public void enrolCourse(Student st, Course c)throws StudentNotFoundException, StudentCourseLimitException, CourseNotFoundException {
        if(checkStudent(st) >= 0){ //checking given student is student of university
            if(st.getCourseCount() < 5){ //checking student enrolled for less than 5 courses
                if(checkCourse(c) >= 0) { //checking given course is available in the university
                    st.addCourse(c);
                    System.out.println("Student enrolled for " + c);
                }else {
                    throw new CourseNotFoundException("Course not found!");
                }
            }else {
                throw new StudentCourseLimitException("Student course limit reached!");
            }
         }else {
            throw new StudentNotFoundException("Student not found!");
        }
     }

     //checkStudent() method checks passed student is part of university or not
     private int checkStudent(Student st) {
         for(int i=0; i<students.length; i++) {
             if(students[i].equals(st)) {
                 return i;
             }
         }
         return -1;
     }

     //checkCourse() method checks passed course available in university or not
     private int checkCourse(Course c) {
         for(int i=0; i<courses.length; i++) {
             if(students[i].equals(c)) {
                 return i;
             }
         }
         return -1;
     }

     //manageStudent() method re-arranges the students array by removing graduated student from students array
     private void manageStudents(int index){
         int j=0;
        for (int i=0; i<students.length; i++){
            if(i == index){
                i++;
            }
            students[j] = students[i];
            j++;

        }
        studentCount = j;
         //System.out.println(studentCount);
     }


}
