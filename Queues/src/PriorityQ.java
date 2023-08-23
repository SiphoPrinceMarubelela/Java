import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQ {
	
public static void main(String[] args) {
		
		//Priority Queue = A FIFO data structure that serves elements
		//				   with the highest priorities first
		//				   before elements with lower priority
		
		//let's make a Queue of student GPAs
		Queue<Double> queue1 = new LinkedList<Double>();
		
		//add data
		queue1.offer(3.0);
		queue1.offer(2.5);
		queue1.offer(4.0);
		queue1.offer(1.5);
		queue1.offer(2.0);
		
		//display data
		while(!queue1.isEmpty()) {
			//this displays the GPAs in the order they were entered
			System.out.println(queue1.poll());
		}
		
		System.out.println("\nPriority Queues\n");
		
		//for a priority queue, we change the class that implements the Queue interface
		Queue<String> queue2 = new PriorityQueue<String>();
		
		//add data
		queue2.offer("Emmanzo");
		queue2.offer("Flowers");
		queue2.offer("Thabang");
		queue2.offer("Prince");
		queue2.offer("Daphney");
		
		//display data
		while(!queue2.isEmpty()) {
			//this displays the GPAs in ascending order they were entered
			System.out.println(queue2.poll());
		}
		
		/*
			Since we're working with numbers, the output is in ascending order.
			If we're working with Strings, the output is in alphabetical order
			If we want the output in descending order, we can pass a parameter in our constructor:
			Queue<DataType> queue2 = new PriorityQueue<DataType>(Collections.reverseOrder());
			numbers will be in decreasing order, Strings will be in reverse alphabetic order
		*/
	}
	
}