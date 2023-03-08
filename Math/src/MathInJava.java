import java.util.Scanner;

//Mathematics in the java language
public class MathInJava {

	public static void main(String[] args) {

		//variables 
		double a = 3.14;
		double b = -10;
		double f = 25;
		
		//operations
		double c = Math.max(a, b);
		double d = Math.abs(b);
		double e = Math.sqrt(f);
		
		//output
		System.out.println("The bigger value of the two is: " + c);
		System.out.println("The absolute value of -10 is: " + d);
		System.out.println("The square root of 100 is: " + e);
		
		//HYPOTENUSE OF A TRIANGLE
		System.out.println("\n\t===== The HYPOTENUSE of a triangle =====\t");
		System.out.println("Hello, which side of the triangle would you like to calculate? \n");
		System.out.print("Enter:\n1. Adjascent side.\n2. Opposite side. \n3. Hypotenuse side. \nYou choose option: ");
		//variable for response
		Scanner input = new Scanner(System.in);
		int response = input.nextInt();
		double adjacent, opposite, hypotenuse;
		final int INVALID_INPUT = -1; 
		
		//validate input
		if(response == 1 || response == 2 || response == 3) {
			//operate on response
			switch(response) {
				
			case 1:
				
				System.out.print("Enter dimention of the opposite side: ");
				opposite = input.nextDouble();
				System.out.print("Enter dimention of the hypotenuse side: ");
				hypotenuse = input.nextDouble();
				//Adjacent side = 
				adjacent = Math.sqrt(Math.pow(hypotenuse, 2) - Math.pow(opposite, 2));
				//output
				System.out.print("The adjacent side's dimension for this triangle is: " + adjacent + " units");
				
			break;
			case 2:
				
				System.out.print("Enter dimention of the adjascent side: ");
				adjacent = input.nextDouble();
				System.out.print("Enter dimention of the hypotenuse side: ");
				hypotenuse = input.nextDouble();
				//opposite side = 
				opposite = Math.sqrt(Math.pow(hypotenuse, 2) - Math.pow(adjacent, 2));
				//output
				System.out.print("The opposite side's dimension for this triangle is: " + opposite + " units");
				
			break;
			case 3:
				
				System.out.print("Enter dimention of the adjascent side: ");
				adjacent = input.nextDouble();
				System.out.print("Enter dimention of the opposite side: ");
				opposite = input.nextDouble();
				//hypotenuse side = 
				hypotenuse = Math.sqrt(Math.pow(adjacent, 2) + Math.pow(opposite, 2));
				//output
				System.out.print("The hypotenuse side's dimension for this triangle is: " + hypotenuse + " units");
				
			break;
			
			}
			
		} 
		
		if(response != 1 || response != 2 || response != 3) { 
			System.out.println("INVALID INPUT! Enter 1, 2, or 3!");
			System.exit(INVALID_INPUT);
		}
		
		input.close();
		
	}

}
