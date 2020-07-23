package codepath.week3;

public class RemoveDuplicates {
	Node head;
	
	class Node{
		int data;
		Node next;

		public Node(int data){
			this.data = data;
			next = null;
		}
	}
	
	
	public static void main (String [] args) {
		RemoveDuplicates list = new RemoveDuplicates();
		
		list.add(10);
		list.add(20);
		list.add(20);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(70);
		list.add(80);
		
		list.printValue();
		
		System.out.println("Removing Duplicates......");
		
		list.removeDuplicates();
		
		
		list.printValue();
	}

	private void add(int i) {
		// TODO Auto-generated method stub
		Node newNode =  new Node(i);
		
		if (head == null) {
			head = newNode;
		} else {
			Node temp = head ;
			while (temp.next != null) {
				temp = temp.next; 
			}
			temp.next = newNode;
		}
	}

		void removeDuplicates() 
	    { 
	        /*Another reference to head*/
	        Node curr = head; 
	  
	        /* Traverse list till the last node */
	        while (curr != null) { 
	             Node temp = curr; 
	            /*Compare current node with the next node and  
	            keep on deleting them until it matches the current  
	            node data */
	            while(temp!=null && temp.data==curr.data) { 
	                temp = temp.next; 
	            } 
	            // Set current node next to the next different element denoted by temp
	            curr.next = temp; 
	            curr = curr.next; 
	        } 
	    } 
	


	  
	  void printValue() {
		  Node newHead = head;
		  
		  while (newHead != null){
			  System.out.println(newHead.data);
			  newHead = newHead.next;
		  }
	  }
	
	
	

}

