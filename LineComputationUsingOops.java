package bl.com.day8practiceproblemspart2;

import java.util.Scanner; 

public class LineComputationUsingOops {
	
	
	
	public static void main(String[] args) {
		
	System.out.println("Welcome to Line Comparison Computation Program");
	
	LineComputation Obj1 = new LineComputation();
	
	System.out.println("Enter coordinates of first line" );
	double length1=Obj1.calcLinelength();
	System.out.println('\n');
	System.out.println("Enter coordinates of second line");
	double length2=Obj1.calcLinelength();
	Obj1.checkEqualityOfTwoLines(length1,length2);
	Obj1.compareLines(length1,length2);

	}
	
	
	
	
	

}




class  LineComputation
{
	

	

	
	
	 public  double calcLinelength() {
		 
		 	Scanner myObj = new Scanner(System.in);
			

		 	System.out.println("Enter x1 coordinate ");
			float x1 = myObj.nextFloat();
			System.out.println("Enter y1 coordinate ");
			float y1 = myObj.nextFloat();
			System.out.println("Enter x2 coordinate ");
			float x2 = myObj.nextFloat();
			System.out.println("Enter y2 coordinate ");
			float y2 = myObj.nextFloat();
			
			
			System.out.println(" x1= " + x1 );
			System.out.println(" y1= " + y1 );
			System.out.println(" x2= " + x2 );
			System.out.println(" y2= " + y2 );
		 
			double linelength = (Math.sqrt(( ((x2 - x1) *(x2 - x1)) + ((y2- y1) * (y2 - y1)))));
			System.out.println("line length is = " + linelength  );
			
			return linelength;
			
			
		  }

	
	 public void checkEqualityOfTwoLines(double linelength1, double linelength2)
   	{
     	

		 	if (linelength1==linelength2)
		 		{
		 			System.out.println("Two lines are equal");
 		  
		 		}
		  
		 	else
		 	{
		 			System.out.println("Two lines are not equal");
 		  
 		  
		 	}
			
 	 			
   	}
   
	 public void compareLines(double linelength1, double linelength2)
		{
			 if (linelength1==linelength2)
     	  {
     		  System.out.println("Two lines are equal");
			
     	  }
			
			 else if (linelength1 > linelength2)
			 {
				 
				System.out.println("Linelength1 is greater than Linelength2");
				 
			 }
			
			 else
			
			 {
				 System.out.println("Linelength2 is greater than Linelength1");
				 
			 }
		}
	
	
	
	
	}











