/* This class contains methods to add and multiply matrices
 * */

public class List<T> {
	
	T[] obj;
	
	//default constructor
	public List() {}
	
	//Parameterised constructor
	public List(T[] object) {
		this.obj = object;
	}
	
	//getters and setters
	public T[] getObject() {
		return this.obj;
	}
	
}
