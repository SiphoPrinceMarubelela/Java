import animal.type.Dog;
import animal.type.Frog;

/**
 * This program is aimed at solving the diamond problem.
 * This occurs as a consequence of allowing multiple inheritence. In Java, we can't achieve multiple inheritence
 * using classes. We can only achieve such using interfaces.
 * @author Sipho Marubelela siphoprincemarubelela@gmail.com
 * @version 0.1
 */
public class DiamondProblem {

	public static void main(String[] args) {
		System.out.println("Let's understand multiple inheritence in Java");
		
	}

}

/*
 	CASE 1:
 	
 	interface A {
 		default void m() {
 			System.out.println("m() from interface A");
 		}
 	}
 	
 	interface B extends A {
 	
 	}
 	
 	interface C extends A {
 	
 	}
 	
 	public class D implements B, C {
 		public static void main(String[] args) {
 			new D().m();
 		}
 	}
  
 */

/*
 
  	CASE 2:
  	
  	interface A {
  		default void m() {
  			System.out.println("m() from interface A");
  		}
  	}
  	
  	interface B extends A {
  		@Override
  		default void m() {
  			System.out.println("m() from interface B");
  		}
  	}
  	
  	interface C extends A {
  	
  	}
  	
  	public class D implements B,C {
  		public static void main(String[] args) {
  			new D().m();//m() from interface B will be invoked, because, sub-interfaces have higher priority.
  		}
  	}
  
*/

/*
 
 	CASE 3:
  	
  	interface A {
  		default void m() {
  			System.out.println("m() from interface A");
  		}
  	}
  	
  	interface B extends A {
  		@Override
  		default void m() {
  			System.out.println("m() from interface B");
  		}
  	}
  	
  	interface C extends A {
  		@Override
  		default void m() {
  			System.out.println("m() from interface C");
  		}
  	}
  	
  	public class D implements B,C {
  		//the compiler will force us to override the method m() in the class also because of the ambiguity
  		//of the interfaces B, and C having their own definitions of m()
  		@Override
  		public void m() {
  			B.super.m();//we choose which method to invoke using the super keyword.
  		}
  	
  		public static void main(String[] args) {
  			new D().m();
  		}
  	}
 
 */
