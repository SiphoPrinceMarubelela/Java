/**
 * This class solves the Coderbyte Assessment ProblemALG005B
 * @author Sipho Marubelela siphoprincemarubelela@gmail.com
 */
public class ProblemALG005b {

	/**
	 * This is the main function for my program
	 * @param args The program arguments
	 */
	public static void main(String[] args) {
		
		//attributes
		int sizeOfShape = 6;//>=2 && <=9
		int xCentre = 30;	//>=1 && <=79
		int yCentre = 9;	//>=1 && <=25
		
		displayShape(sizeOfShape, xCentre, yCentre);
		
	}
	
	/**
	 * This function prints out a shape based on the specified inputs
	 * @param shapeSize The number of "$" on each side of the diamond
	 * @param xCenter The x-coordinate of tne diamond's center
	 * @param yCenter The y-coordinate of the diamond's center
	 */
	public static void displayShape(int shapeSize, int xCenter, int yCenter) {
		
		final char DIAMOND = '$';
		final char DEFAULT_CHARACTER = '=';
		char[][] displayWorld = new char[25][79];
		//variable ranges
		if((shapeSize >= 2 && shapeSize <= 9) && (xCenter >= 1 && xCenter <= 79) && (yCenter >= 1 && yCenter <= 25)) {
			
			for(int r = 0; r < 25; r++) {//25 rows
				for(int c = 0; c < 79; c++) {//79 columns
					displayWorld[r][c] = DEFAULT_CHARACTER;
					//relevant numbering
					if(r == 9) {
						displayWorld[r][0] = '1';
					}
					if(r == 19) {
						displayWorld[r][0] = '2';
					}
					if(c == 9) {
						displayWorld[r][c] = '1';
					}
					if(c == 19) {
						displayWorld[r][c] = '2';
					}
					if(c == 29) {
						displayWorld[r][c] = '3';
					}
					if(c == 39) {
						displayWorld[r][c] = '4';
					}
					if(c == 49) {
						displayWorld[r][c] = '5';
					}
					if(c == 59) {
						displayWorld[r][c] = '6';
					}
					if(c == 69) {
						displayWorld[r][c] = '7';
					}
					//center coordinate
					displayWorld[yCenter][xCenter] = DIAMOND;
					
					//the 4-cardinal points
					displayWorld[yCenter - shapeSize + 1][xCenter] = DIAMOND;
					displayWorld[yCenter + shapeSize - 1][xCenter] = DIAMOND;
					displayWorld[yCenter][xCenter - shapeSize + 1] = DIAMOND;
					displayWorld[yCenter][xCenter + shapeSize - 1] = DIAMOND;
					
					//NB: I AM SORRY FOR NOT IMPLIMENTING THE DIAGONAL "$" PLACEMENTS, I SADLY NEEDED A BIT MORE TIME
					
					/*
					
					//diamond placement
					while(r <= shapeSize) {
						if(c >= 0 && c <= r) {
							//diamond sides
							int upperLeft;
							int upperRight;
							int lowerLeft;
							int lowerRight;
							
							//length from side to center
							upperLeft = xCenter - c;
							upperRight = xCenter + c;
							lowerLeft = yCenter + r;
							lowerRight = yCenter - r;
							
							//displaying
							displayWorld[lowerLeft][upperLeft] = DIAMOND;
							displayWorld[lowerLeft][upperRight] = DIAMOND;
							displayWorld[lowerRight][upperLeft] = DIAMOND;
							displayWorld[lowerRight][upperRight] = DIAMOND;
							
							r++;
							c++;
							
						}
					}
					
					*/
					
					System.out.print(displayWorld[r][c]);
				} 
				System.out.println();
			}
			
		} else {
			System.err.println("sizeOfShape (>= 2 and <= 9); xCentre (>= 1 and <= 79); yCentre (>= 1 and <= 25)");
		}
		
	}

}
