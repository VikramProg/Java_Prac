package day01.exceptions.unchecked_exception.class_cast_exception;

public class Test {
    public static void main(String args[]) {
        ChildTest ct1 = new ChildTest("Jai", "Adithya");
        ct1.display();
        ParentTest pt2 = new ParentTest("Vijay");

       // ChildTest ct2 = (ChildTest) pt2;

        try {
            ChildTest ct2 = (ChildTest) pt2;
        }catch (ClassCastException e){
            System.out.println(e.getMessage());
        }

        System.out.println("Program Executed Successfully!");
    }
}
