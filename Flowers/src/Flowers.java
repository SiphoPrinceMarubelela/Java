
public class Flowers {

	public static void main(String[] args) {
		//loop through the numbers 1 to 50
		for(int number = 1; number <= 50; number++) {
	
			//checking if numbers are divisible
			if(number % 3 == 0) {
				System.out.println(number + " - ROSES");
			}
			if(number % 7 == 0) {
				System.out.println(number + " - VIOLETS");
			}
			if((number % 3 == 0) && (number % 7 == 0)) {
				System.out.println(number + " - TULIPS");
			}
			if((number % 3 != 0) || (number % 7 != 0)) {
				System.out.println(number);
			}
			
		}
		
	}

}
