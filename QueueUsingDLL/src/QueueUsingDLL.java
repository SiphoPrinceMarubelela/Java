import java.util.LinkedList;

public class QueueUsingDLL {
	
	//1. create DLL queue using DLL class
	private LinkedList list = null;
	
	//2. initialize DLL using default constructor
	public QueueUsingDLL() {
		this.list = new LinkedList();
	}
	
	//3. other methods we are going to implement
	public void enqueue(int data) {
		//add data to the DLL
		list.add(data);
		System.out.println(data + " Enqueued into Queue");
	}
	
	public void dequeue() {
		//check if it's empty
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return;
		}
		//remove 1st element
		int data = front();
		list.remove(0);
		System.out.println(data + " Dequeued from Queue");
	}
	
	//return 1st element of my queue
	public int front() {
		return (int)list.get(0);
	}
	
	public int rear() {
		//last element of the list is at index size - 1
		return (int)list.get(size() - 1);
	}
	
	public boolean isEmpty() {
		//we use the list's isEmpty method, since if it is empty, our queue will be empty as well
		return list.isEmpty();
	}
	
	public int size() {
		return list.size();
	}
	
	// type toString and let eclipse finish-off everything for you
	//should look like :
	/*
	 * @Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	 * */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return list.toString();
	}
	
	public static void main(String[] args) {
		QueueUsingDLL q = new QueueUsingDLL();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		
		System.out.println(q);  //prints array notation [10, 20, 30]
		q.dequeue(); //removes 1st element on Queue
		System.out.println(q); //[20, 30]
		System.out.println("Front element is " + q.front()); //20
		System.out.println("Rear element is " + q.rear());  //30
		System.out.println("Size of the Queue is " + q.size()); //2
		System.out.println("Is Queue empty: " + q.isEmpty()); //No
		q.dequeue(); //only 30 is left
		q.dequeue(); //nothing is left
		System.out.println("Is Queue empty: " + q.isEmpty()); //Yes
		System.out.println(q); //[]
	}
	
}