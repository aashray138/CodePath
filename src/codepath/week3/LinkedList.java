package codepath.week3;


public class LinkedList {
	Node head;
	
	class Node{
		String data;
		Node next;

		public Node(String data){
			this.data = data;
			next = null;
		}
	}
	
	
	public static void main (String [] args) {
		LinkedList list = new LinkedList();
		list.push("10");
		list.push("20");
		list.push("30");
		list.push("40");
		list.push("50");
		list.push("60");
		list.push("70");
		list.push("80");
		list.push("90");
		
		list.CreateCycle();
		
		System.out.println("Result " + list.detectCycle(list));
	}



	private void push(String string) {
		if (head == null ) {
			Node newNode = new Node(string);
			head = newNode;
		} else {
			Node newNode = new Node(string);
			newNode.next = head;
		}
	}
	
	private void CreateCycle() {
		// TODO Auto-generated method stub
		head.next.next.next = head.next.next.next.next.next;
		
	}
	
	private boolean detectCycle(LinkedList list) {
		Node rabbit = list.head;
		Node turtle = list.head;
		
		while (rabbit != null && turtle != null) {
			rabbit = rabbit.next;
			turtle = turtle.next.next;
			if (rabbit.data == turtle.data) {
				return true;
			}
		}
	
		return false;
	}





}

