package codepath.week6;

			// Queues : Last in First Out 
public class QueueClass {

	class QueueNode{
		QueueNode next;
		int data;
		
		QueueNode(int data){
			this.data = data;
			next = null;
		}
	}
	
	QueueNode head;
	QueueNode tail;
	
	public static void main (String [] args) {
		
		QueueClass newQ = new QueueClass();
		
		System.out.println(newQ.isEmpty());
		newQ.enqueue(21);
		newQ.enqueue(22);
		System.out.println(newQ.peek());
		
		newQ.dequeue();
		newQ.dequeue();
		
		System.out.println(newQ.isEmpty());
		
		newQ.enqueue(23);
		newQ.enqueue(24);
		
		System.out.println(newQ.peek());
	}

	private void enqueue(int i) {
		QueueNode newNode = new QueueNode(i);	
		if (isEmpty()) {
			head = newNode;
			tail = head;
		} else {
			tail.next = newNode;
		}
	}

	private void dequeue() {	
		if (isEmpty()) {
			return;
		} else {
			head = head.next;
		}
	}

	private boolean isEmpty() {
		return head == null ;
	}
	
	private int peek() {
		int val = Integer.MIN_VALUE;
		if (!isEmpty()) {
			val = head.data;
		} else {
			System.out.println("Invalid Data!");
			System.exit(-1);
		}
		return val;
	}
}
