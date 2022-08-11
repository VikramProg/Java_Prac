package checked_exception;

public class ClassNotFoundExceptionTestCase {

    public static void classNotFoundException()throws ClassNotFoundException{
        System.out.println("Execution Started");
        Class.forName("oracle");
    }

    public static void main(String[] args) {
        //classNotFoundException();

        try{
            classNotFoundException();
        }catch(ClassNotFoundException e){
            System.out.println(e);
        }

    }
}
