
public class Student {
	private String name;
	private int id;
	private Phone p1;
	private static int counter = 0;
	
	    public Student(String name, int id, Phone p1) {
	    	this.name = name;
	    	this.id = id;
	    	this.p1 = p1;
	    	counter++;
	    }
	
	    public void setname(String name){
	    	this.name = name;
	    }
	
	    public void setid(int id){
	    	this.id = id;
	    }
	
	    public String getname(){
	    	return name;
	    }
	
	    public int getid(){
	    	return id;
	    }
	
	    public static int getcounter(){
	    	return counter;
	    }
	
	
	    public String toString (){
	    	return "\nName : "+ name + "\nID : " + id + "\nPhone detials : " + "Phone Details : " + p1.toString();
	    }
	
	}