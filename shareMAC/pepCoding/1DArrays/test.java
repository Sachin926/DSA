import java.util.*;
class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList list = new LinkedList(sc.nextInt());
        for (int i = 1; i < n; i++) {
            list.addLast(sc.nextInt());
        }
        list.display();
        System.out.println("The size is ->" + list.getSize());
        list.reverse();
        list.display();
        System.out.println("The mid value is = " + list.getMid());
        list.reverseInChunks(2);
        list.display();
    }
}

class Node {
    int data;
    Node next;
    Node (int data) {
        this.data = data;
    }
}
class LinkedList {
    int data;
    Node head;
    LinkedList(int data) {
        this.head = new Node(data);
    }
    void addLast(int n) {
        Node node = head;
        while (node.next != null) {
            node = node.next;
        }
        node.next = new Node(n);
    }
    void addFirst(int n) {
        Node temp = new Node(n);
        temp.next = head;
        head = temp;
    }
    void deleteFirst() {
        head = head.next;
    }
    void deleteLast() {
        Node node = head;
        while (node.next.next != null) {
            node = node.next;
        }
        node.next = null;
    }
    int getSize() {
        int count = 0;
        Node node = head;
        while (node.next != null) {
            count++;
            node = node.next;
        }
        return ++count;
    }
    void display() {
        Node node = head;
        while (node.next != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println(node.data);
    }
    int getMid() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow.data;
    }
    void reverse() {
        Node cur = head;
        Node prev = null;
        Node forw = head.next;
        while (cur != null) {
            cur.next = prev;
            prev = cur;
            cur = forw;
            if (forw != null)
            forw = forw.next;
        }
        head = prev;
    }
    void reverseInChunks(int k) {
        Node prev = null;
        Node cur = head;
        Node forw = cur.next;
        int count = 0;
        while (cur != null && count <= k) {
            cur.next = prev;
            prev = cur;
            cur = forw;
            if (forw.next != null) {
                forw = forw.next;
            }
            count++;
            if (count > k) {
                count = 0;
                cur = cur.next;
                prev = prev.next;
                if (forw != null) {
                    forw = forw.next;
                }
            }
        }
    }
}