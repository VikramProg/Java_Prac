package enroll_student;

public class Course {

    private String name;
    private int id;
    private int classRoom;
    private int limit;

    public Course(String name, int id, int classRoom, int limit) {
        this.name = name;
        this.id = id;
        this.classRoom = classRoom;
        this.limit = limit;
    }

    public int getLimit() {
        return limit;
    }

    public int getId() {
        return id;
    }

    public int getClassRoom() {
        return classRoom;
    }

    public String getName() {
        return name;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public boolean getCourse(String name) {
        return this.getName().equals(name);
    }

}
