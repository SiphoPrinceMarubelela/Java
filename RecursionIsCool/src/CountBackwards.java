import java.util.Scanner;

/**
 * This class counts backwards based on a supplied integer from the user
 * @author Sipho Prince
 * @version 01
 */

public class CountBackwards {

	public static void countBackwards(int number) {
		if(number < 0) {
			System.out.println("Cannot countdown from a negative number!");
		} else if(number == 0) {
			System.out.println(number + "\nCountdown finished!");
		} else {
			System.out.println(number);
			number--;
			countBackwards(number);
		}
	}
	
	public static void main(String[] args) {
		System.out.print("Enter number to begin countdown: ");
		Scanner scInput = new Scanner(System.in);
		int number = scInput.nextInt();
		System.out.println("The countdown will begin at: " + number);
		countBackwards(number);
	}

}
