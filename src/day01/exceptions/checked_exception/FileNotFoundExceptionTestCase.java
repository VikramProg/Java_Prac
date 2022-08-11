package day01.exceptions.checked_exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFoundExceptionTestCase{

    public static void fileNotFoundExceptionTest()throws FileNotFoundException{

        System.out.println("Execution Started");

        FileReader file = new FileReader("C:\\Users\\vikra\\Desktop\\b.txt");

        System.out.println("File Found!");

    }

    public static void main(String[] args) {

        // fileNotFoundExceptionTest();

            try {
                fileNotFoundExceptionTest();
            }catch(FileNotFoundException e){
                System.out.println(e);
            }

        System.out.println("Program Execution  Successfully!");
    }
}
