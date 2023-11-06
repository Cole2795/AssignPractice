
public class UndergraduateStudent extends Student {
	private String courseName;
	private int courseLength;

    public UndergraduateStudent(String name, int id, Phone p1, String courseName, int courseLength) {
    	super(name, id, p1);
    	this.courseLength = courseLength;
    	this.courseName = courseName;
    }

	public void setcourseLength(int courseLength){
		this.courseLength = courseLength;
	}

	public void setcourseName(String courseName){
		this.courseName = courseName;
	}

	public String toString(){
		return super.toString() + "\nCourse Name : " + courseName + "\nCourse Length : " + courseLength;
	}


}
