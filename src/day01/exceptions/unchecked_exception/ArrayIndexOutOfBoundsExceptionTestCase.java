package unchecked_exception;

import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionTestCase {
    static Scanner sc = new Scanner(System.in);

    public static void arrayIndexOutOfBoundsExceptionTest(int[] intArray) {
        System.out.print("Enter a index: ");
        int indexToPrint = sc.nextInt();
        System.out.println(intArray[indexToPrint]);
    }

    public static void main(String[] args) {
        int intArray[] = new int[]{10, 20, 30, 40};

        //arrayIndexOutOfBoundsExceptionTest(intArray);

        try{
            arrayIndexOutOfBoundsExceptionTest(intArray);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }

        System.out.println("Program Executed Successfully!");

    }
}
