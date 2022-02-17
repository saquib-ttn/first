 /*   Q3) Write a java program to show following menu to the user:
*******Menu*******
1. Calculate Area of Circle
2. Calculate Circumference of a Circle
3. Exit.
Choose an option (1-3): 
Take radius as user input.
Hint: Use Switch statement to act on the menu. Also area and circumference methods should be static
*/
	
	import java.util.Scanner;
	

   class thirdQues
   {
       
		      //method for calculating area of a circle
		  static double Area(double r)
		  { 
		       double area=3.14*r*r;
			   return area;
			   
		  }
		  
					//method for calculating circumference of a circle
		  static double Circumference(double r)
		  {
		  double circum=2*3.14*r;
		  return circum;
		  }
		  
		  
		  
		  void menu()
		  { 
		     int i;
			 double r;
			 Scanner sc=new Scanner(System.in);
			 
			 System.out.println("\n**********************menu***********************\nenter 1 for calculating area  of a circle\nenter 2 for calculating circumference of a circle\nenter 3 for exit the program\n");
                  i=sc.nextInt();
              switch(i)
			  {
			       case 1 :    System.out.println("\n enter the radius of a circle");
                 				   r=sc.nextDouble(); 
								    System.out.println("the Area of a circle having radius "+r+" is "+Area(r));
						            break;
				    case 2:    System.out.println("\n enter the radius of a circle");
                 				   r=sc.nextDouble(); 
								    System.out.println("the Circumference of a circle having radius "+r+" is "+Circumference(r));
						            break;
					case 3 :System.out.println("Exiting");
					             break;
					default : System.out.println("you enter in valid choice");
					
				   
              }			 
		     
			   
		  
		  }
		  
		  public static void main(String[] args)
		  {    
		       thirdQues obj = new thirdQues();
			   
		      obj.menu();
		  }
   
   }
