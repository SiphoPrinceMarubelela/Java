import java.util.LinkedList;

/* 

                           Linked lists in Java
						   ---------------------

    before we understand linked lists, we will compare Arrays and ArrayLists & LinkedLists to see where they  come short
    and why we would then use linked lists.

								ArrayLists
								----------
	- arrays & arrayLists store elements in contiguous memory locations
	- these data structures are great for accessing elements because of their index attribute
	- inserting & deleting elements is however challenging, especially more at the beginning of the array...
	  to insert at an index, we have to shift all elements one unit to the right to make space for the element to 
	  be inserted. The process of deleting is also the same, we have to move all elements 1 unit to the left so 
	  as to close the gap.
	- these problems are where LinkedLists have an advantage
	
								LinkedLists (singly)
								--------------------
	- made up of a long chain of nodes.
	- each node has 2 parts, the data we need to store & the address (pointer) to the next node in line
	- they don't have an index & the nodes are non-contiguous, they can be anywhere. each node knows where
	  the next node resides. (Think of it as "trying to find the end of the linked list using a set of clues
	  . Starting at the head, each node has a clue(address/pointer) to where to find the next node").
	- to see if you're at the TAIL of the LinkedList, check the address, if it points to NULL, then that node 
	  is the TAIL
	  
	  
	Inserting an element:
	- no shifting of elements. 
	- wherever we want to store the node, we check the address of the previous node & assign the address of 
	  our new node, so that new node points to the node that is next in line.
	- Then we replace the address of our previous node to point to the address of our new node that we want to 
	  insert.
	  
	Deleting an element:
	- which ever node we want to delete, we make it's previous node to point to the node that is next in line
	  to the node we want deleted.
	  
	Searching an element:
	- this is where arrays are superior to LinkedLists. Arrays use an index to access an element when we are searching
	- when searching on a linked list, we have to start at the head and go through the list, toward the tail until we 
	  find our element. This is bad because it takes time (O(n) - it would take linear time), but insertion/deletion 
	  would take constant time.
	- this variation of  a linked list, is called a SinglyLinkedList. There are single links to each node.
	
	
								LinkedLists (doubly)
								--------------------	
	- require more memory to store 2 addresses in each node, since there are 2 links to each node, 1 for the previous node
	  and the other for the next node in line.
	- 1 benefit about doubly linked lists is that we can traverse the list from HEAD to TAIL and again, from TAIL to HEAD
	  (in reverse). This is because each node knows where the previous node and the next node is.
	- The HEAD node's previous is NULL.
	- The TAIL node's next is NULL
*/

public class SinglyLinkedList {
	
	public static void main(String[] args) {
		
		//create the list
		LinkedList<String> linkedList = new LinkedList<String>();
		
		/*
			
			- Hovering over LinkedList, we see that the LinkedList class extends AbstractSequentialList & implements List, Deque
			  , Cloneable
			- Deque is a doubly linked Queue, so our LinkedList is also a DoublyLinkedList implementation
			- LinkedList keeps a pointer to the HEAD & TAIL of our list
	 
		*/
		
		//LinkedList class implements 12 methods:
		
		/*
		
					| Throws exception | Special value | Throws exception | Special value | 
			Insert  | addFirst(e)      | offerFirst(e) | addLast(e)       | offerLast(e)
			Remove  | removeFirst()    | pollFirst()   | removeLast()     | pollLast()
			Examine | getFirst()       | peekFirst()   | getLast()        | peekLast()
			
			- ON TOP OF THERSE 12 METHODS, WE CAN treat our linkedList as a Stack or Queue: we can push, pop
		
		*/
		
		//let's treat our linked list as a stack:
		
		System.out.println("List implementation as a stack:\n");
		
		linkedList.push("A");
		linkedList.push("B");
		linkedList.push("C");
		linkedList.push("D");
		linkedList.push("F");
		
		//let's print the linked list. Our LL is behaving as a stack
		System.out.println(linkedList); //[F, D, C, B, A]
		
		//let's "pop" an element out of the stack
		linkedList.pop();
		
		//let's print the linkedList
		System.out.println(linkedList); //[D, C, B, A]
		
		System.out.println("\nList implementation as a queue:\n");
		
		LinkedList<String> linkedList1 = new LinkedList<String>();
		
		//let's treat our linked list as a queue:
		linkedList1.offer("A");
		linkedList1.offer("B");
		linkedList1.offer("C");
		linkedList1.offer("D");
		linkedList1.offer("F");
		
		//print the queue
		System.out.println(linkedList1); //[A, B, C, D, F]
		
		//let's remove an element from our queue
		linkedList1.poll();
		
		//print the queue
		System.out.println(linkedList1); //[B, C, D, F]
		
		//insertion & deletion:
		linkedList1.add(4, "E");
		System.out.println("Insertionin of 'E' in our Queue: " + linkedList1);
		
		linkedList1.remove("E");
		System.out.println("Deletion of 'E' in our Queue: " + linkedList1);
		
		//searching of an element in our LinkedList using the indexOf() method
		System.out.println(linkedList1.indexOf("B"));
	}
	
}
