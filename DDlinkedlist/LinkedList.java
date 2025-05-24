package DSUDMY.DDlinkedlist;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size = 0;

    class Node {
        int value;
        Node next;
        Node prev;

        public Node(int data) {
            this.value = data;
            this.next = null;
            this.prev = null;
        }
    }

    public LinkedList(int data) {
        Node newNode = new Node(data);
        head = newNode;
        tail = newNode;
        size = 1;
    }

    public boolean append(int data) {
        Node newNode = new Node(data);
        if (size == 0) {
            head = tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        size++;
        return true;
    }

    public void printDList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
        return;
    }

    public void printRev() {
        Node temp = tail;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.prev;
        }
        return;
    }
}
