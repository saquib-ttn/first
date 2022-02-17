 /*
Q4) Create a two dimensional array of integers and display:
sum of all elements of each column
sum of all elements of each row
*/

import java.util.Scanner;

class forthQues
{

   public static void main(String[] args)
   {
	   Scanner obj = new Scanner(System.in);
	   int r,c;
	   int rowSum=0,colSum=0;
	   
	   
	   System.out.println("enter the number of rows : ");
	   r=obj.nextInt();
	   System.out.println("enter the number of columns : ");
	   c=obj.nextInt();
	   
	   int[][] a=new int [r][c];
	   
	   int i,j;
	                               // loop for enter the values in an array
	   for(i=0;i<r;i++)
	   {
		   for(j=0;j<c;j++)
		   { System.out.print("enter a["+i+"]["+j+"] element of array :  ");
	         a[i][j]=obj.nextInt();
		   }
	   }
	   
	                    //loop for displaying the values of array
	    System.out.println("\nthe 2-D-array entered by you :");
	    for(i=0;i<r;i++)
	   {
		   for(j=0;j<c;j++)
		   {      
	               
	         System.out.print(a[i][j]+"  ");
		   }
		   System.out.print("\n");
	   }
	   
	                //loop for summation of row elements
	   for(i=0;i<r;i++)
	   { rowSum=0;
        
		   for(j=0;j<c;j++)
		   {
			   rowSum+=a[i][j];
			 
		   }
		   System.out.println("the sum of "+(i+1)+"th row : "+rowSum);
		 
		   
	   }
	   
	   System.out.println("\n");
	   
	             //loop for summation of column elements
	   for(j=0;j<c;j++)
	   { colSum=0;
		   for(i=0;i<r;i++)
		   {
			   colSum+=a[i][j];
			  
		   }
		   System.out.println("the sum of "+(j+1)+"th column : "+colSum);
		   
		   
	   }
	   
	   
	   
   }

}