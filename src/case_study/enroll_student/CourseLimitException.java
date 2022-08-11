package case_study.enroll_student;

public class CourseLimitException extends Exception{
    public CourseLimitException(String msg) {
        super(msg);
    }
}
