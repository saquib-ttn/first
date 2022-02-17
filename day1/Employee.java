/*Q5) Create a class named Employee with fields firstname,lastname,age and designation. 
The class should:

have all types of constructors to initialize the object
class should also have setter methods to update a particular field
Override its toString method to display a meaningful message using all these fields.
*/

import java.util.Scanner;

class Employee
{
     private String firstName,lastName,designation;
     int age;

   Employee()
   {     
	   firstName="Saquib";
	   lastName="Ansari";
	   designation="Trainee";
	   age=21;
	   
	   System.out.println("\nvalue initialize by default constructor");
   }	   
   
   Employee(String fname,String lname,String desig,int ag)
   {
	   this.firstName=fname;
	   this.lastName=lname;
	   this.designation=desig;
	   this.age=ag;
	   
	   System.out.println("\nvalue initialize by parameterized constructor");
	   
	   
	  
   }
   
   Employee(Employee e)
   {
	   this.firstName=e.firstName;
	   this.lastName=e.lastName;
	   this.designation=e.designation;
	   this.age=e.age;
	   
	     System.out.println("\nvalue initialize by copy constructor");
	  
   }
	
	public String toString()
	{
		return ("the detail of employee is :\nname : "+firstName +" "+lastName+"\nage : "+age+"\ndesignation : "+designation);
	}
	
	
	String getMethod()
	{
		return(firstName+" "+lastName);
	}
	
	void setmethod(String fname ,String lname)
	{
		this.firstName=fname;
		this.lastName=lname;
	}
	
	
	public static void main(String[] args)
	{  System.out.println("*********************************************************");
		Employee e1=new Employee();
		System.out.println("\n"+e1);
		
	    System.out.println("***********************************************************");
		Employee e2=new Employee("Faizan","Ansari","teacher",20);
		System.out.println("\n"+e2);
		
	    System.out.println("************************************************************");	
		Employee e3=new Employee(e1);
		System.out.println("\n"+e3);
		
		System.out.println("************************************************************");	
		
		Scanner sc=new Scanner(System.in);
		String fname,lname;
		System.out.print("enter First Name : ");
		fname=sc.next();
		
		System.out.print("enter Last Name : ");
		lname=sc.next();
		
		e1.setmethod(fname,lname);                                                        //method used for setting the values
		
		System.out.println("the values assign by the help of setmethod and displaying by the help of getmethod");
		System.out.println("Employee name is : "+e1.getMethod());                 //method use for get the values
	}
}


