//This program will be showing how to create a basic menu
import javax.swing.JOptionPane;

public class JavaxGUI {

	public static void main(String[] args) {
		
		//prompt user for their name
		String name = JOptionPane.showInputDialog("What is your name? ");
		//output the user response
		JOptionPane.showMessageDialog(null, "Hello, " + name);
		//store the age of the user
		int age = Integer.parseInt(JOptionPane.showInputDialog("How old are you? "));
		//output the result
		JOptionPane.showMessageDialog(null, "You are , " + age + " , years old.");
		//working with a double datatype
		double height = Double.parseDouble(JOptionPane.showInputDialog("How tall are you? "));
		//output the result
		JOptionPane.showMessageDialog(null, "You are , " + height + " , cm tall.");

	}

}
