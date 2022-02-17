//Q2) Write a program to read user input until user writes XDONE and then show the entered text by the user on commandline 



import java.util.Scanner;

class secondQues
{
	

public static void main(String[] args)
{      
   Scanner obj=new Scanner(System.in);
	 String output="",input;
	 
	 
	 System.out.println("enter the text you want and please enter XDONE to terminate ....... \n");
	 
	 input=obj.nextLine();
	 while(!input.equals("XDONE"))
	 {
		 output+=input;
         output+=" ";
      input=obj.nextLine();
	 }
	 
	 
	 System.out.println("\n\nThe text entered by the user is as follows  : \n" + output);
	 
	 

}

	
}
