/*
 * Variables in java are place holders for data.
 * They contain datatypes.
 * 
 * There are 8 primitive datatypes :
 * 	boolean : size, 1-bit. value, true or false
 * 	byte	: size, 1-byte (8-bits). value, -128 to 127
 * 	short	: size, 2-bytes. value, -32768 to 32767
 * 	int		: size, 4-bytes. value, -2 billion to 2 billion
 * 	long	: size, 8-bytes. value, -9 quintillion to 9 quintillion
 * 	float	: size, 4-bytes. value, fractional number up to 6-7 digits
 * 	double	: size, 8-bytes. value, fractional number up to 15 digits
 * 	char	: size, 2-bytes. value, single character/letter/ASCII value
 * 
 * There's also 1 reference datatype:
 * 	String : size varies, eg: "Hello World"
 * 
 * Reference datatypes store addresses, and are user defined
 * */

public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;								//declaration
		x = 123;							//assignment
		
		//int x = 123; 						  initialization
		/*huge numbers are succeeded with a suffix L for long, f for floats...
		 * int y = 2389347548905303402084L
		 * int z = 3/141576f
		*/
		
		double y = 3.14;
		boolean z = true;
		char symbol = '@';
		String name = "Sipho Marubelela";
		
		//printing a string with an integer variable
		System.out.println("My number is: " + x);

	}

}
