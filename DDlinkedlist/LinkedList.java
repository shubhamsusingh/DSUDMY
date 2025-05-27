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

    public boolean preAppend(int data) {
        Node newNode = new Node(data);
        if (size == 0) {
            head = tail = newNode;
            return true;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }

        size++;
        return true;

    }

    public void printDList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("null");
        return;
    }

    public void printRev() {
        Node temp = tail;
        System.out.print("null");
        while (temp != null) {
            System.out.print("<-" + temp.value);
            temp = temp.prev;
        }
        System.out.println("<-null");
        return;
    }

    public Node removeLast() {
        if (size == 0) {
            return null;
        }
        Node temp = tail;
        if (size == 1) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
        }

        size--;
        return temp;
    }

    public Node removeFirst() {
        if (size == 0) {
            return null;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
        head.prev = null;
        size--;
        return temp;
    }

    public Node get(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        Node temp = head;
        if (index < size / 2) {
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        } else {
            temp = tail;
            for (int i = size - 1; i > index; i--) {
                temp = temp.prev;
            }
        }
        return temp;
    }

}
