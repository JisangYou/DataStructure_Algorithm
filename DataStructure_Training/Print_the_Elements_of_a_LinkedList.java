package DataStructure_Training;

public class Print_the_Elements_of_a_LinkedList {

	public static void main(String[] args) {
		Node head = new Node();
		if (head != null) {
			Node temp;
			temp = head;
			while (temp != null) {
				System.out.println(temp.data);
				temp = temp.next;
			}

		}

	}
}

class Node {
	int data;
	Node next;
}