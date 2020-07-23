package codepath.week6;

public class StackClass {
	StackNode head;
	
	class StackNode{
	
		StackNode next;
		int data; 
		
		public StackNode(int data){
			this.data = data;
			next = null;
			
		}
	}
	
	public static void main (String [] args) {
	// Stack operations
		
		StackClass stack = new StackClass();
		
		// 1 . Push
			stack.push(1);
			stack.push(2);
			stack.push(3);
			stack.push(4);
			stack.push(5);
	
			
		// 2 . Pop
			stack.pop();
			stack.pop();
			
		// 3 . isEmpty
			System.out.println(stack.isEmpty());
			
		// 4 . Peek
			System.out.println(stack.peek());
	}

	// Push : 
	// Consider : Empty Stack ; Create Head
	// Non Empty Stack : newNode.next = head and head = newNode
	private void push(int i) {
		StackNode newNode = new StackNode(i);
		if(isEmpty()) {
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
		
	}
	
	// Pop : 
	// Consider : Empty Stack ; Invalid Operation
	// Non Empty Stack : removal of head i.e. head = head.next;
	private void pop() {
		// TODO Auto-generated method stub
		if (isEmpty()) {
			System.out.println("Can not pop an Empty Stack");
			System.exit(-1);
		} else {
			head = head.next;
		}
	}
	
	// isEmpty :
	// return head == null
	private boolean isEmpty() {
		// TODO Auto-generated method stub
		return head == null;
	}
	
	// Peek : 
	// Consider : Empty Stack ; Invalid Operation
	// Non Empty Stack : return head.data;
	private int peek() {
		// TODO Auto-generated method stub
		int val = Integer.MIN_VALUE;
		if (!isEmpty()) {
		val = head.data;
		} else {
			System.out.println("Invalid Operation");
			System.exit(-1);
		}
		return val;
	}
}
