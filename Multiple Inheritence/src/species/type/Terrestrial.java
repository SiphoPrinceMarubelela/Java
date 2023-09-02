package species.type;

/**
 * This is a terrestrial interface
 * @author sipho marubelela siphoprincemarubelela@gmail.com
 */
public interface Terrestrial {

	/**
	 * Method to describe where a terrestrial animal lives
	 */
	default public void livesIn() {
		System.out.println("I live on land!");
	}
	
}
