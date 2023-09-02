package animal.type;

/**
 * This class creates an instance of a Dog
 * @author sipho marubelela siphoprincemarubelela@gmail.com
 */
public class Labrador implements Animal {

	//attribute
	public String color = "Child color";
	
	@Override
	public void specialCapabilities() {
		System.out.println("I am a very athletic dog!");
	}

	@Override
	public void makeNoise() {
		System.out.println("Woof, woof!");
	}
	
}
