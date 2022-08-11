package unchecked_exception;

public class NumberFormatExceptionTestCase {

    public static void numberFormatExceptionTest() {
        int intValue = Integer.parseInt("abc");
    }

    public static void main(String[] args) {

        //numberFormatExceptionTest();

        try{
           numberFormatExceptionTest();
        }catch(Exception e){
            System.out.println(e);
        }

        System.out.println("Program Executed Successfully!");
    }
}
