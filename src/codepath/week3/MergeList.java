package codepath.week3;

// Go through the linked list and update accordingly
public class MergeList {

	class Node{
		
		Node next;
		int data;
		
		Node(int data){
			this.data = data;
			next = null;
		}
	}
	

	Node head;
	static int len1; 
	static int len2;
	
	
	
	public static void main (String [] args) {
		
		MergeList list1 = new MergeList();
		MergeList list2 = new MergeList();
		
		MergeList mergedList;
		
		list1.add(1);
		len1++;
		list1.add(1);
		len1++;
		list1.add(2);
		len1++;
		list1.add(3);
		len1++;
		
		list2.add(1);
		len2++;
		list2.add(2);
		len2++;
		list2.add(3);
		len2++;
		list2.add(4);
		len2++;
		list2.add(5);
		len2++;
		list2.add(6);
		len2++;
		
		mergedList = mergeList(list1, list2);
		mergedList.printValue();

		
	}

	  static MergeList mergeList(MergeList list1, MergeList list2) {
		
		int length1 = len1;
		int length2 = len2;
		
		Node head1 = list1.head;
		Node head2 = list2.head;
		
		int firstNum ;
		
		if (head1.data > head2.data) {
			firstNum = head2.data;
		} else {
			firstNum = head1.data;
		}
		
		MergeList newMerge = null;
	
		while (length1 > 0 && length2 > 0) {
					
		}
		
		return newMerge;
		
		
	}

	 void add(int i) {
		
		Node newNode = new Node(i);
		
		if (head == null) {
			head = newNode;
		} else {
			Node temp = head;
				while (temp.next != null) {
					temp = temp.next;
				}
			temp.next = newNode;
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
