import java.util.Scanner;

public class LoopExercise30331 {

	public static void main(String[] args) {
	
		// 303.3.1 Loop Exercise
	Question1();
	Question2();
	Question3();
	

		
	}
	
	public static void Question1() {
		
		//Write a program that uses nested for loops to print a multiplication table.
		
		System.out.println("1st Question");
		System.out.println(" ");
		
				for(int i=1; i<=12; i++){ 
				    for(int j=1; j<=12; j++){
				     System.out.print(i*j+"\t");
				            }
				            System.out.println();
				        }
	}
     public static void Question2 () {
	
	/*
	 * Write a program that prompts the user to enter two positive integers, and
	 * find their greatest common divisor (GCD).
	 */	
		System.out.println(" ");
		System.out.println("2nd Question");
		System.out.println(" ");
		
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the first integer number");
		int A = sc.nextInt();
	    System.out.println(" Enter the second integer number");
		int B = sc.nextInt();
		
		if (A>0 && B>0) {
			while (A!=B) {
				if (A>B)
					A=A-B;
				else
				B=B-A;
			}
			System.out.println("Gcd of two numbers is "+A);
			
		}
		else
		    System.out.println("Please enter numbers greater than zero");
}
     
     public static void Question3() {
 		
    	//Suppose the tuition for a university is $10,000 for the current year and increases by 7 percent every year. 
    			
    			System.out.println(" ");
    			System.out.println("3rd Question");
    			System.out.println(" ");
    			
    			double t = 10.000;
    			int year = 0;
    			while (true) {
    				if ( t >= 20.000)break ;
    				t= t * 1.07;
    				year ++;
    				
    			}
    			System.out.println(year);
     }
}



