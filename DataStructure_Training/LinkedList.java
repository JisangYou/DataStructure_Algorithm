package DataStructure_Training;

/**
 * 
 * 문제 아님. 개념 보강용!
 * 
 * @author JisangYou
 *
 *         LinkedList 문제를 접했을떄, 매우 생소했다. 그동안 사용해본적이 별로 없었기때문에 이번 기회에 정리를 해본다.
 *
 */

public class LinkedList {
	// 첫번째 노드를 가리키는 필드
	private Node head;
	private Node tail;
	private int size = 0;

	private class Node {
		// 데이터가 저장될 필드
		private Object data;
		// 다음 노드를 가리키는 필드
		private Node next;

		public Node(Object input) {
			this.data = input;
			this.next = null;
		}

		// 노드의 내용을 쉽게 출력해서 확인해볼 수 있는 기능
		public String toString() {
			return String.valueOf(this.data);
		}
	}

	public void addFirst(Object input) {
		// 노드를 생성합니다.
		Node newNode = new Node(input);
		// 새로운 노드의 다음 노드로 해드를 지정합니다.
		newNode.next = head;
		// 헤드로 새로운 노드를 지정합니다.
		head = newNode;
		size++;
		if (head.next == null) { /* 다음 노드가  없을 떄  tail이 head가 된다. */
			tail = head;
		}
	}

	public void addLast(Object input) {
		// 노드를 생성합니다.
		Node newNode = new Node(input);
		// 리스트의 노드가 없다면 첫번째 노드를 추가하는 메소드를 사용합니다.
		if (size == 0) {
			addFirst(input);
		} else {
			// 마지막 노드의 다음 노드로 생성한 노드를 지정합니다.
			tail.next = newNode;
			// 마지막 노드를 갱신합니다.
			tail = newNode;
			// 엘리먼트의 개수를 1 증가 시킵니다.
			size++;
		}
	}

	Node node(int index) { //TODO 이 부분 이해 필요
		Node x = head;
		for (int i = 0; i < index; i++)
			x = x.next;
		return x;
	}

	public void add(int k, Object input) {
		// 만약 k가 0이라면 첫번째 노드에 추가하는 것이기 때문에 addFirst를 사용합니다.
		if (k == 0) {
			addFirst(input);
		} else {
			Node temp1 = node(k - 1);
			// k 번째 노드를 temp2로 지정합니다.
			Node temp2 = temp1.next;
			// 새로운 노드를 생성합니다.
			Node newNode = new Node(input);
			// temp1의 다음 노드로 새로운 노드를 지정합니다.
			temp1.next = newNode;
			// 새로운 노드의 다음 노드로 temp2를 지정합니다.
			newNode.next = temp2;
			size++;
			// 새로운 노드의 다음 노드가 없다면 새로운 노드가 마지막 노드이기 때문에 tail로 지정합니다.
			if (newNode.next == null) {
				tail = newNode;
			}
		}
	}

	public String toString() {
		// 노드가 없다면 []를 리턴합니다.
		if (head == null) {
			return "[]";
		}
		// 탐색을 시작합니다.
		Node temp = head;
		String str = "[";
		// 다음 노드가 없을 때까지 반복문을 실행합니다.
		// 마지막 노드는 다음 노드가 없기 때문에 아래의 구문은 마지막 노드는 제외됩니다.
		while (temp.next != null) {
			str += temp.data + ",";
			temp = temp.next;
		}
		// 마지막 노드를 출력결과에 포함시킵니다.
		str += temp.data;
		return str + "]";
	}

	public Object removeFirst() {
		// 첫번째 노드를 temp로 지정하고 head의 값을 두번째 노드로 변경합니다.
		Node temp = head;
		head = temp.next;
		// 데이터를 삭제하기 전에 리턴할 값을 임시 변수에 담습니다.
		Object returnData = temp.data;
		temp = null;
		size--;
		return returnData;
	}

	public Object remove(int k) {
		if (k == 0)
			return removeFirst();
		// k-1번째 노드를 temp의 값으로 지정합니다.
		Node temp = node(k - 1);
		// 삭제 노드를 todoDeleted에 기록해 둡니다.
		// 삭제 노드를 지금 제거하면 삭제 앞 노드와 삭제 뒤 노드를 연결할 수 없습니다.
		Node todoDeleted = temp.next;
		// 삭제 앞 노드의 다음 노드로 삭제 뒤 노드를 지정합니다.
		temp.next = temp.next.next;
		// 삭제된 데이터를 리턴하기 위해서 returnData에 데이터를 저장합니다.
		Object returnData = todoDeleted.data;
		if (todoDeleted == tail) {
			tail = temp;
		}
		// cur.next를 삭제 합니다.
		todoDeleted = null;
		size--;
		return returnData;
	}

	public Object removeLast() {
		return remove(size - 1);
	}

	public int size() {
		return size;
	}

	public Object get(int k) {
		Node temp = node(k);
		return temp.data;
	}

	public int indexOf(Object data) {
		// 탐색 대상이 되는 노드를 temp로 지정합니다.
		Node temp = head;
		// 탐색 대상이 몇번째 엘리먼트에 있는지를 의미하는 변수로 index를 사용합니다.
		int index = 0;
		// 탐색 값과 탐색 대상의 값을 비교합니다.
		while (temp.data != data) {
			temp = temp.next;
			index++;
			// temp의 값이 null이라는 것은 더 이상 탐색 대상이 없다는 것을 의미합니다.이 때 -1을 리턴합니다.
			if (temp == null)
				return -1;
		}
		// 탐색 대상을 찾았다면 대상의 인덱스 값을 리턴합니다.
		return index;
	}

	// 반복자를 생성해서 리턴해줍니다.
	public ListIterator listIterator() {
		return new ListIterator();
	}

	class ListIterator {
		private Node lastReturned;
		private Node next;
		private int nextIndex;

		ListIterator() {
			next = head;
			nextIndex = 0;
		}

		// 본 메소드를 호출하면 next의 참조값이 기존 next.next로 변경됩니다.
		public Object next() {
			lastReturned = next;
			next = next.next;
			nextIndex++;
			return lastReturned.data;
		}

		public boolean hasNext() {
			return nextIndex < size();
		}

		public void add(Object input) {
			Node newNode = new Node(input);
			if (lastReturned == null) {
				head = newNode;
				newNode.next = next;
			} else {
				lastReturned.next = newNode;
				newNode.next = next;
			}
			lastReturned = newNode;
			nextIndex++;
			size++;
		}

		public void remove() {
			if (nextIndex == 0) {
				throw new IllegalStateException();
			}
			LinkedList.this.remove(nextIndex - 1);
			nextIndex--;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		LinkedList numbers = new LinkedList();
		numbers.addFirst(5);
		numbers.addLast(10);
		numbers.addLast(15);
		numbers.addLast(20);
		numbers.addLast(30);
		System.out.println(numbers.removeLast());
		System.out.println(numbers);
	}

}

/*
  자료구조의 일종으로, Linked List라는 말 그대로 어떤 데이터 덩어리(이하 노드Node)를 저장할 때 그 다음 순서의 자료가 있는 위치를 데이터에 포함시키는 방식으로 자료를 저장한다. 예를 들어 한 반에 있는 학생들의 자료를 저장한다면, 학생 하나하나의 신상명세 자료를 노드로 만들고, 1번 학생의 신상명세 자료에 2번 학생 신상명세가 어디있는지 표시를 해 놓는 방식
 

 노드(Node)와 링크(Link)로 구성되며,
 노드는 실제 정보를 담고 있는 하나의 단위이고,
 링크는 노드간의 위치정보를 저장하고 있어 연결리스트의 순서를 유지할 수 있도록 하는 연결고리라 할 수 있다.
 노드의 시작점은 head, 끝점은 tail이라 부르며 노드의 추가, 삭제, 탐색이 가능하다.
 출처: http://takeuu.tistory.com/172 [워너비스페셜]
 
 
*/

/* 
 * 
링크드 리스트에서의 삽입은 삽입할 노드를 삽입할 위치의 이전노드, 다음노드와 연결만 해주면 되고,
삭제도 마찬가지로 삭제하고 싶은 노드에 연결되어있는 앞 뒤의 노드를 서로 이어주면 된다.
하지만 링크드 리스트는 탐색을 위해서는 항상 첫번째 노드부터 비교해야한다 하는 단점이 있다.
위에서 설명한 내용과 같이, 배열과 링크드 리스트는 장단점이 반대이므로
데이터 탐색이 많이 필요한 상황에서는 배열을 사용하고
데이터 삽입, 삭제가 많이 필요한 상황에서는 링크드 리스트를 사용하는 것이 효율적

*/

/*
 "ArrayLIst" 클래스는 배열리스트로서 내부구조가 배열식으로 나열되어 있습니다. 
반면에 "LinkedList" 클래스는 포인터로 링크되는 구조
[출처] [Java 강의53] 자바 자료구조 클래스 -3 (LinkedList 사용법) |작성자 모프

*/
