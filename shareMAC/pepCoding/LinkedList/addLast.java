import java.util.*;
class addLast {
	static class Node {
		int data;
		Node next;
		Node (int data) {
			this.data = data;
			next = null;
		}
	}
	public static void main(String[] args) {
		Node root = new Node(-1);
		addLast(root, 1);
		addLast(root, 2);
		addLast(root, 3);
		addLast(root, 4);
		addLast(root, 5);
		displayList(root.next);
	}
	static void addLast(Node head, int data) {
		Node itr = head;
		while (itr.next != null) {
			itr = itr.next;
		}
		itr.next = new Node(data);
	}
	static void displayList(Node head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}
}