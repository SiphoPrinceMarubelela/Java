import java.util.Stack;

public class Main {

	//The stack = a LIFO data structure. Last In First Out.
	//			  it stores objects into a sort of "vertical tower"
	//			  push() addsss onto the stack at the top
	//			  pop() removes from the stack at the top
	
	//Think of a stack of books, CDs or plates at a buffet, where you have access to one end of the plate dispenser
	//To remove an item from the stack,  we have to pop() from the top of the stack
	
	public static void main(String[] args) {

		//create a stack of games
		Stack<String> games = new Stack<String>();
		
		//the stack has 5 methods it implements from the Vector class.
		// push()
		// pop()
		// peek()
		// empty()
		// search()
		
		//to check if our games stack is empty...it should be
		System.out.println("Is the stack empty?: "+ games.empty());
		
		//let's push games onto the stack
		//Grand Theft Auto
		//FIFA
		//Need for Speed
		//God of War
		//Call of Duty
		games.push("Call of Duty");
		games.push("God of War");
		games.push("Need for Speed");
		games.push("FIFA");
		games.push("Grand Theft Auto");
		
		//check again if the stack is empty...now it's not
		System.out.println("Is the stack empty?: "+ games.empty());
		
		//to see what is in our stack?
		System.out.println(games);
		
		//to see the element at the top of our stack
		System.out.println("The element at the top of the stack is: " + games.peek());
		
		//to see what is in our stack? after the peek
		System.out.println(games);
		
		//to remove the top element on the stack
		String myFavouritGame = games.pop();
		System.out.println("My favourite game is: " + myFavouritGame);
		
		//let's see our staack now
		System.out.println(games);
		
		//searching on a stack returns the position of the element on the stack if found...if not, it returns -1
		
		//let's search for a game in our stack
		System.out.println("Is there Naruto on the game stack?: " + games.search("Naruto"));
		System.out.println("Is there FIFA on the game stack?: " + games.search("FIFA")); //position 1 from top
		System.out.println("Is there God of War on the game stack? :" + games.search("God of War")); //position 3 from top
	
		/*
		 
		  USES OF STACKS
		  1. redo/undo featuresin text editors
		  2. moving forward / backward through browser history
		  3. backtracking algorithms (maze or file directories)
		  4. calling functions (call stack)
		  
		*/
		
	}

}
