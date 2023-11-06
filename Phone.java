public class Phone {
	private String make;
	private int number;
	    public Phone(String make, int number) {
	    	this.make = make;
	    	this.number = number;
	
	    }
	
	    public void setnumber(int number){
	    	this.number = number;
	    }
	    public void setmake(String make){
	    	this.make =make;
	    }
	
	    public String getmake(){
	    	return make;
	    }
	
	    public int getnumber(){
	    	return number;
	    }
	
	    public String toString(){
	    	return "\nMake : " + make + "\nNumber : " + number;
	    }
}