/**
 * @author sipho marubelela (siphoprincemarubelela@gmail.com)
 * @version 0.1
 * @see MagicSquare A class containing the solution to a magic square problem.
 */

/*

	SUM of 1st n natural numbers (TOTAL) : (n * (n + 1))/2
	SUM of each row, column, or diagonal : TOTAL/3 = [(n * (n + 1))/2]/3
	
	NB: Procedure-
	* Have an even number count & an odd number count
		Odd + Odd = Even
		Odd + Even = Odd
		Even + Even = Even
	* Check number in the center:
	*   If center number = Even
			Odd numbers = x
			Even numbers = y

	*   If center number + Odd
			Odd numbers = z
			Even numbers = z
		

*/
public class MagicSquare {

	/**
	 * This method is the entry point to our program.
	 * @param args an array of program arguments.
	 * @return N/A
	 */
	public static void main(String[] args) {
		
		int n = 10; // Change this value to the desired size of the magic square
        int[][] magicSquare = generateMagicSquare(n);
        printMagicSquare(magicSquare);
		
	}
	
	/**
	 * This method generates a magic square
	 * @param n The size of the magic square
	 * @return magicSquare the magic square array
	 */
	public static int[][] generateMagicSquare(int n) {
		int[][] magicSquare = new int[n][n];
	    int row = 0;
	    int col = n / 2;
	        
	    for(int num = 1; num <= n * n; num++) {
	    	magicSquare[row][col] = num;
	            
	        row--;
	        col++;
	            
	        if(row < 0) {
	        	row = n - 1;
	        }
	        if (col == n) {
	            col = 0;
	        }
	           
	        if (magicSquare[row][col] != 0) {
	            row = (row + 2) % n;
	            col = (col - 1 + n) % n;
	        }
	    }
	        
	    return magicSquare;
	}

	/**
	 * This method prints the magic square generated
	 * @param magicSquare the magic square array to be printed.
	 */
	public static void printMagicSquare(int[][] magicSquare) {
		for (int[] row : magicSquare) {
	        for (int num : row) {
	            System.out.printf("%4d", num);
	        }
	        System.out.println();
		}
	}

}
