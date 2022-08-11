package day01.exceptions.checked_exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IOExceptionTestCase {

    public static void iOExceptionTest()throws IOException{
        System.out.println("Execution Started");
        FileReader file = new FileReader("C:\\Users\\vikra\\Desktop\\a.txt");

        // Reading content inside a file
        BufferedReader fileInput = new BufferedReader(file);

        System.out.println(fileInput.readLine());

        // Closing all file connection
        // using close() method
        fileInput.close();
    }

    public static void main(String[] args) {

        // iOExceptionTest();

        try {
           iOExceptionTest();
        }catch(IOException e){
            System.out.println(e);
        }

        System.out.println("Program Execution  Successfully!");
    }
}
