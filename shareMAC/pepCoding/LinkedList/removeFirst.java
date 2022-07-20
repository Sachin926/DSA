import java.util.*;
class removeFirst {
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
		Node node = removeFirst(root.next);
		System.out.println();
		displayList(node);
	}
	static Node removeFirst(Node head) {
		if (head == null) {
			return null;
		}
		else {
			head = head.next;
			return head;
		}
	}
	static int getSize(Node head) {
		int count = 0;
		while (head != null) {
			count++;
			head = head.next;
		}
		return count;
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