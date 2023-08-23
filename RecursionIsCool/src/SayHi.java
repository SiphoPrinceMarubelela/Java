import java.util.Scanner;

/**
 * This class demonstrates recursion
 * @author Sipho Marubelela
 * @verison 01
 */

public class SayHi {

	/**
	 * Basic recursive function that greets the user, the number of times specified
	 * @param numberOfGreetings The number of times the program will greet the user
	 * @param name The name of the user
	 */
	public static void sayHi(String name, int numberOfGreetings) {
		if(numberOfGreetings == 0) {
			System.out.println("Done! Goodnight " + name);
		} else {
			System.out.println("Hi, " + name);
			numberOfGreetings--;
			sayHi(name, numberOfGreetings);
		}
	}
	
	/**
	 * Entry point of the application
	 * @param args String arguments to the program
	 */
	public static void main(String[] args) {
		System.out.print("Hello, what is your name: ");
		Scanner scInput = new Scanner(System.in);
		String yourName = scInput.nextLine();
		System.out.print("Nice to know you, " + yourName + ". How many times should I greet you?: ");
		int numberOfTimes = scInput.nextInt();
		sayHi(yourName, numberOfTimes);
	}

}
