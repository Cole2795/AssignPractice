import java.util.Scanner;
public class SstudentTes {
	public static void main (String args[]) {

    	Scanner input = new Scanner(System.in);

    	Student s[] = new Student[3];
    	//int ages[] = new int[3];

    	for (int i = 0;i<s.length;i++){
    		System.out.println();
    		System.out.println();
    		System.out.print("Enter name : " );
    		String name = input.next();
    		System.out.print("Enter id : " );
    		int id = input.nextInt();
    		System.out.print("Enter phone make : " );
    		String make = input.next();
    		System.out.print("Enter phone number : " );
    		int number = input.nextInt();

    		Phone p1 = new Phone(make, number);

    		//ask if student is postgrad or under grad
    		System.out.print("Enter 1 for postgrad or 2 for undergrad or 3 for student: " );
    		int choice  = input.nextInt();

    		if (choice == 1){
    			System.out.print("Enter course name : " );
    			String cname = input.next();
    			System.out.print("Enter course length : " );
    			int cl  = input.nextInt();

    			//create undergrad student
    			s[i] = new UndergraduateStudent(name,id,p1, cname, cl);
    		}
    		else if (choice == 2){
    			System.out.print("Enter degree type : " );
    			String dt = input.next();
    			System.out.print("Enter grade : " );
    			int dgrade  = input.nextInt();
    			//create undergrad student
    			s[i] = new UndergraduateStudent(name,id,p1, dt, dgrade);
    		}
    		else{
    			s[i] = new Student(name, id, p1);
    		}
    	}

    	for(int i = 0;i<s.length;i++){
    		System.out.println();
    		System.out.println("Number of students is " + s[i].getcounter());
    		System.out.println(s[i].toString());
    	}

    }//end main


}
