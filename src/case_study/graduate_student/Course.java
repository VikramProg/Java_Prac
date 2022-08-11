package case_study.graduate_student;

public class Course {
	private final int id;
	private final String name;
	private final int classRoom;
	
	public Course(int id,String name,int classRoom) {
	this.id = id;
	this.name = name;
	this.classRoom = classRoom;
	}

	public String toString() {
		return "ID: "+ id +", Name: "+ name + ", ClassRoom : " +classRoom;
	
}
}
