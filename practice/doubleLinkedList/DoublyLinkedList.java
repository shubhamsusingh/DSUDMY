package practice.doubleLinkedList;

public class DoublyLinkedList {
    public Node head;
    public Node tail;
    int length;

    class Node {
        Node next;
        Node prev;
        int val;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.prev = null;
        }

    }

    public void append(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }

    public void preAppend(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        length++;
    }
}
