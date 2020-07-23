package codepath.week3;

public class RemoveInstances {

	
	// Given a linked list and a value x, remove all instances of x from the linked list

	class Node{
		Node next;
		int val;
		
		Node(int val){
			this.val = val;
		}
	}
	
	 Node head = null;
	
	  void push (int number) {
		  	
		  Node currHead = head; 
		  
		  Node newNode = new Node(number);
		  
		 if (head == null) {
			 head = newNode;
		 } else {
			 currHead = newNode;
			 currHead.next = head;
			 head = currHead;
		 }
		 
	 }
	  
	  void removeInstances(int key)  
	    {  
	        // Store head node  
	        Node temp = head, prev = null;  
	      
	        // If head node itself holds the key  
	        // or multiple occurrences of key  
	        while (temp != null && temp.val == key)  
	        {  
	            head = head.next; // Changed head  
	        }  
	      
	        // Delete occurrences other than head  
	        while (temp != null)  
	        {  
	            // Search for the key to be deleted,  
	            // keep track of the previous node  
	            // as we need to change 'prev->next'  
	            while (temp != null && temp.val != key)  
	            {  
	                prev = temp;  
	                temp = temp.next;  
	            }  
	      
	            // If key was not present in linked list  
	            if (temp == null) return;  
	      
	            // Unlink the node from linked list  
	            prev.next = temp.next;  
	      
	            //Update Temp for next iteration of outer loop  
	            temp = prev.next;  
	        }  
	    }  
	  
	  void printValue() {
		  Node newHead = head;
		  
		  while (newHead != null){
			  System.out.println(newHead.val);
			  newHead = newHead.next;
		  }
	  }
	  
	public static void main(String[] args) {

		RemoveInstances list = new RemoveInstances();

		list.push(20);
		list.push(2121);
		list.push(21);
		list.push(212131);
		list.push(2100);
		list.push(2112);
		list.push(2241);
		list.push(211);
		list.push(2211);
		
		list.printValue();
		System.out.println("---------");
		
		list.removeInstances(20);
		
		
		list.printValue();
		System.out.println("---------");
		
	}

}
