
public class PostgraduateStudent extends Student{

	private String degreeType;
	private int grade;

    public PostgraduateStudent(String name, int id, Phone p1,String degreeType, int grade) {
    	super(name, id, p1);
    	this.degreeType = degreeType;
    	this.degreeType = degreeType;
    }

    public void setgrade(int grade){
    	this.grade = grade;
    }

    public void setdegreeType(String degreeType){
    	this.degreeType = degreeType;
    }

	public String getdegreeType(){
		return degreeType;
	}

	public int  getgrade(){
		return grade;
	}


	public String toString() {
		return super.toString() + "\nDegree Type : "+ degreeType+ "\nGrade : " + grade;
	}
}