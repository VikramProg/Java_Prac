package case_study.enroll_student;

public class StudentLimitException extends Exception{
    public StudentLimitException(String msg){
        super(msg);
    }
}
