package unchecked_exception.class_cast_exception;

public class ChildTest extends ParentTest{
    String childName;
    ChildTest(String parentName, String childName) {
        super(parentName);
        this.childName = childName;
    }
    public void display() {
        System.out.println(childName);
    }
}
