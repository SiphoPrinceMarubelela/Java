import java.util.LinkedList;
import java.util.Queue;

public class Main {
	
	public static void main(String[] args) {
	
		//**********************************************
		
		//Queue = FIFO data structure. First-In First-Out(eg: A line of people)
		
		//		  A collection designed for holding elements prior to processing
		//		  Linear data structure
		
		//		  add	 = enqueue, offer()
		//		  remove = dequeue, poll()
		
		//**********************************************
		
		//Think of a line of people waiting in line to buy a concert ticket 
		//Karen, John, Steve, Harold
		//Karen = head of the queue
		//Harold = tail of the queue
		
		//when Karen has been helped, John becomes the new head of the queue
		//if there's only 1 person in our Queue, they are both the head & tail of the Queue 
	
		//adding objects in a queue(enqueue): we add an object at the end(tail) of our queue
		//removing objects in a queue(dequeue): we remove an object from the head of the queue
	
		Queue<String> queue = new LinkedList<String>();
		
		//there's 3 methods we inherit from the  Collection's class:
		//add(e), remove(), element()
		//NB: Queue is an interface, the Queue class extends Collections class...
		
		/*
		 |_Column 1___|_Column 2__|
		 |	add(e)	  |	 offer(e) |
		 |	remove()  |	 poll()   |
		 |	element() |  peek()   |
			
			NB: Column 1's methods throw exceptions, so it's better to use column 2's methods instead
		*/
		
		//add/queue elements
		queue.offer("Karen");
		queue.offer("John");
		queue.offer("Steve");
		queue.offer("Harold");
		
		//see our queue
		System.out.println(queue);
		
		//to see who is at the front of our line
		System.out.println("The front of the queue has: " + queue.peek());
		
		//remove/dequeue our Queue
		queue.poll();
		
		//Karen shouldn't be in our line
		System.out.println(queue);
		
		//check if Queue is empty
		System.out.println("Is the queue empty?: " + queue.isEmpty());
		
		//see the size of our queue (how long is our line)
		System.out.println("What is the size of our queue: " + queue.size());
		
		//check if an element is contained in our queue
		System.out.println("Does the queue contain Harold?: " + queue.contains("Harold"));
		
		//unlike a stack, if an element is in our queue, our queue won't tell us where exactly it is...
		
		//Where are queues useful?
		
		//1. Keyboard Buffer (letters should appear on the screen in the order they're pressed)
		//2. Printer Queue (Print jobs should be completed in order)
		//3. Used in LinkedLists, PriorityQueues, Breadth-first search
		
	}
	
}