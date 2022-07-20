import java.util.*;
class test {
	static class Node {
		int data;
		Node next;
		Node (int data) {
			this.data = data;
			next = null;
		}
	}
	public static void main(String[] args) {
		Node head = new Node(-1);
		addLast(head, 1);
		addLast(head, 2);
		addLast(head, 3);
		addLast(head, 4);
		addLast(head, 5);
		displayList(head.next);
		reverse(head.next);
	}
	static void reverse(Node head) {
		Node itr = head;
		int n = getSize(head);
		for (int i = n - 1; i >= 0; i--) {
			System.out.print(getNodeAt(head, i).data + " ");
		}
	}
	static Node getNodeAt(Node head, int index) {
		Node itr = head;
		int count = 0;
		while (itr != null) {
			if (count == index) {
				return itr;
			}
			itr = itr.next;
			count++;
		}
		return null;
	}
	static int getSize(Node head) {
		int count = 0;
		Node itr = head;
		while (itr != null) {
			count++;
			itr = itr.next;
		}
		return count;
	}
	static void addFirst(Node head, int data) {
		Node temp = new Node(data);
		temp.next = head;
		head = temp;
	}
	static void addLast(Node head, int data) {
		Node itr = head;
		while (itr.next != null) {
			itr = itr.next;
		}
		itr.next = new Node(data);
	}
	static void displayList(Node head) {
		Node itr = head;
		while (itr != null) {
			System.out.print(itr.data + " ");
			itr = itr.next;
		}
		System.out.println();
	}
}