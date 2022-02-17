 //Q1) Write a class with FirstName, LastName & age field. Print Firstname, LastName & age using static block, static method & static variable respectively.

class firstQues

{
	  
	  static  String FirstName ;
	  static String LastName;
	  static int age;
	  static int count;
	  
	  
	  
	  static
	  {
		  count=1;
		  FirstName="Saquib";
		  LastName="Ansari";
          		  
		  System.out.println("\n\nthe information print by the static block : ");
		  System.out.println( "\nin this we initialize the static variable say count = 1");
		  
		  
		          
	  }
	  
	  
public static void display()
{
	System.out.println(" \n\nthe output is displayed by the static method ");
	System.out.println("FirstName : "+ FirstName + "\nLastName : " + LastName + "\n\n");
	
}

	  
	  
public static void main(String[] args)
{
	       firstQues.display();
}

}
