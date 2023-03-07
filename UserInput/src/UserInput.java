//this class will demonstrate how to get user input from the user

//we import the scanner util package to be able to get user input
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {

		//create a scanner object to get user input
		Scanner scanner = new Scanner(System.in);
		//display user prompt
		System.out.print("What is your name? ");
		//capture user input 
		String userName = scanner.nextLine();
		System.out.print("How old are you? ");
		int age = scanner.nextInt();
		
		//clear the scanner buffer
		scanner.nextLine();
		
		System.out.print("What is your favourite food? ");
		String favouriteFood = scanner.nextLine();
		
		//output the greeting
		System.out.println("\nHello, " + userName);
		System.out.println("You are " + age + " ,years old.");
		System.out.println("Your favourite food is: " + favouriteFood);
		
	}

}
