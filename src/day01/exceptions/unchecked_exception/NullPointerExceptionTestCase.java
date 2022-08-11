package unchecked_exception;

public class NullPointerExceptionTestCase {

    public static void nullPointerExceptionTest(String value) {
        String name = value;
        System.out.println(name.length());
    }

    public static void main(String[] args) {

        //nullPointerExceptionTest(null);

        try{
             nullPointerExceptionTest(null);
        }catch(NullPointerException e){
            System.out.println(e);
        }

        System.out.println("Program Executed Successfully!");
    }
}
