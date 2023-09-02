package species.type;

/**
 * This is an aquatic interface
 * @author sipho marubelela siphoprincemarubelela@gmail.com
 */
public interface Aquatic {

	/**
	 * Method to define where the aquatic animal lives.
	 */
	default public void livesIn() {
		System.out.println("I live in water!");
	}
	
}
