package animal.type;

import species.type.Aquatic;
import species.type.Terrestrial;

/**
 * This class defines an instance of a frog
 * @author sipho marubelela siphoprincemarubelela@gmail.com
 *
 */
public class Frog implements Animal, Terrestrial, Aquatic {

	//attributes
	public String color;
	private String name;
	private String breed;
	private int age;
		
	/**
	* This is the default constructor for a DEFAULT frog
	*/
	public Frog() {
		color = "Green";
		name = "Default Froggo";
		breed = "Bull Frog";
		age = 0;
	}
		
	/**
	* This is the constructor for a unique frog
	* @param _name The name of the frog
	* @param _breed The type of a breed the frog is
	* @param _age The number of months the frog has been alive
	*/
	public Frog(String _name, String _breed, int _age) {
		this.color = "Parent Color";
		this.name = _name;
		this.breed = _breed;
		this.age = _age;
	}
		
	//getters
	/**
	* Method to return a frog's color
	* @return color The color of the frog's fur
	*/
	public String getColor() {
		return color;
	}
		
	/**
	* Method to return a frog's name
	* @return name The frog's name
	*/
	public String getName() {
		return name;
	}
		
	/**
	* Method to return a frog's breed
	* @return breed The type of species the frog is
	*/
	public String getBreed() {
		return breed;
	}
		
	/**
	* Method to return the age of a frog in months
	* @return age The number of months the frog has been alive
	*/
	public int getAge() {
		return age;
	}
		
	//setters
	/**
	* Method to set the frog's color
	* @param _color The desired fur color
	*/
	public void setColor(String _color) {
		this.color = _color;
	}
		
	/**
	* Method to set the frog's name
	* @param _name The frog's name
	*/
	public void setName(String _name) {
		this.name = _name;
	}
		
	/**
	* Method to set the frog's breed type
	* @param _breed The type of a frog it is
	*/
	public void setBreed(String _breed) {
		this.breed = _breed;
	}
		
	/**
	* Method to set the frog's age
	* @param _age How old the frog is in months
	*/
	public void setAge(int _age) {
		this.age = _age;
	}
		
	@Override
	public void specialCapabilities() {
		System.out.println("I can jump from Lilly Pad to Lilly Pad!");
		System.out.println("I am an amphibian!");
	}

	@Override
	public void makeNoise() {
		System.out.println("Croak!");
	}

	@Override
	public void livesIn() {
		Aquatic.super.livesIn();
		System.out.println("I also live on land!");
	}

}
