import java.util.Scanner;

public class CSCD210Lab1{
	
	public static void main(String [] args){
		
		int credits;
		String name;
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Please enter your name ");
		name = kb.nextLine();
		
		System.out.print("Please enter the number of credits you are taking ");
		credits = Integer.parseInt(kb.nextLine());
		
		System.out.println("Welcome " + name);
		
        // This is a ternary operator.  It is a short hand if else statement
        // The format is:  (condition) ? true statement : false statement
        // if credits is not 1 or -1, then print credits, else print credit
		System.out.printf("Good luck taking %d %s\n", credits, (credits != 1 && credits != -1) ? "credits" : "credit");		
        
        // closing the scanner
        kb.close();
	
	} // end main

} // end class