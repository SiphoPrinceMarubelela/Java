package animal.type;

import species.type.Terrestrial;

/**
 * This is the dog class, defining a dog instance
 * @author sipho marubelela siphoprincemarubelela@gmail.com
 */
public class Dog implements Animal, Terrestrial {

	//attributes
	public String color;
	private String name;
	private String breed;
	private int age;
	
	/**
	 * This is the default constructor for a DEFAULT dog
	 */
	public Dog() {
		color = "Brown";
		name = "Default Doggo";
		breed = "German Sherperd";
		age = 0;
	}
	
	/**
	 * This is the constructor for a unique dog
	 * @param _name The name of the dog
	 * @param _breed The type of a breed the dog is
	 * @param _age The number of months the dog has been alive
	 */
	public Dog(String _name, String _breed, int _age) {
		this.color = "Parent Color";
		this.name = _name;
		this.breed = _breed;
		this.age = _age;
	}
	
	//getters
	/**
	 * Method to return a dog's color
	 * @return color The color of the dog's fur
	 */
	public String getColor() {
		return color;
	}
	
	/**
	 * Method to return a dog's name
	 * @return name The dog's name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Method to return a dog's breed
	 * @return breed The type of species the dog is
	 */
	public String getBreed() {
		return breed;
	}
	
	/**
	 * Method to return the age of a dog in months
	 * @return age The number of months the dog has been alive
	 */
	public int getAge() {
		return age;
	}
	
	//setters
	/**
	 * Method to set the dog's color
	 * @param _color The desired fur color
	 */
	public void setColor(String _color) {
		this.color = _color;
	}
	
	/**
	 * Method to set the dog's name
	 * @param _name The dog's name
	 */
	public void setName(String _name) {
		this.name = _name;
	}
	
	/**
	 * Method to set the dog's breed type
	 * @param _breed The type of a dog it is
	 */
	public void setBreed(String _breed) {
		this.breed = _breed;
	}
	
	/**
	 * Method to set the dog's age
	 * @param _age How old the dog is in months
	 */
	public void setAge(int _age) {
		this.age = _age;
	}
	
	@Override
	public void specialCapabilities() {
		System.out.println("I can fetch anything you can throw away from me!");
		System.out.println("I am a mammal!");
	}

	@Override
	public void makeNoise() {
		System.out.println("Woof!");
	}
	
}
