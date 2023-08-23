//This program familiarises me with java expressions

public class Expressions {

	public static void main(String[] args) {

		/*
		 * expressions = operands and operators
		 * operands	   = values, variables, numbers, quantity
		 * operators   = + - * / %
		 * */
		
		//create a variable to store the number of friends I have
		int friends = 10;
		//operations on this value
		//friends++;						 //we increase friends by 1
		//friends--;						 //we decrease friends by 1
		//friends = friends / 3;			//integer division truncates the remainder
		//friends = (double) friends / 3; //we cast to double to retain decimal part
		friends = friends % 2;			//returns remainder
		
		//output the result
		System.out.println(friends);
		
	}

}
