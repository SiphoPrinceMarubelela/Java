/*
 * This program aims to display how to switch variables.
 * */

public class SwitchVariables {

	public static void main(String[] args) {

		//declare and initialize two variables
		String variableOne = "Water";
		String variableTwo = "Oros";
		//create a temporary variable to store temporary data
		String tempVariable = null;
		
		//Before the change 
		System.out.println("\t===== BEFORE THE CHANGE =====\t");
		System.out.println("Variable one: " + variableOne);
		System.out.println("Variable two: " + variableTwo + "\n");
		
		//fill the temporary variable with the contents of variable one
		tempVariable = variableOne;
		//change variable two to one
		variableOne = variableTwo;
		//change variable two to the temporary one's contents
		variableTwo = tempVariable;
		
		//display the result
		System.out.println("\t===== AFTER THE CHANGE =====\t");
		System.out.println("Variable one: " + variableOne);
		System.out.println("Variable two: " + variableTwo);
		
	}

}
