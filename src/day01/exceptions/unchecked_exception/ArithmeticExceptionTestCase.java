package unchecked_exception;

import java.util.Scanner;

public class ArithmeticExceptionTestCase {
    static Scanner sc = new Scanner(System.in);

    public static void arithmeticExceptionTest() {
        System.out.print("Enter value 1: ");
        int a = sc.nextInt();
        System.out.print("Enter value 2: ");
        int b = sc.nextInt();
        System.out.println("Division result = " + a / b);
    }

    public static void main(String[] args) {

        // arithmeticExceptionTest();

        try{
            arithmeticExceptionTest();
        }catch(ArithmeticException e){
            System.out.println(e);
        }

        System.out.println("Program Executed Successfully!");
    }
}
