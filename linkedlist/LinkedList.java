package udmyDs.linkedlist;

public class LinkedList {

    private Node head;
    private Node tail;
    private int size = 0;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public LinkedList(int data) {
        Node newNode = new Node(data);
        head = newNode;
        tail = newNode;
        size = 1;
    }

    public void getHead() {
        if (head == null) {
            System.out.println("Head : Null");
        } else {
            System.out.println("Head : " + head.value);
        }
    }

    public void getTail() {
        if (head == null) {
            System.out.println("Tail : Null");
        } else {
            System.out.println("Tail : " + tail.value);
        }
    }

    public int getSize() {
        return size;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value);
            temp = temp.next;
        }
        System.out.println();
        return;
    }

    public void append(int data) {
        Node newNode = new Node(data);
        if (size == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void preAppend(int data) {
        Node newNode = new Node(data);
        if (size == 0) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public Node removeFisrt() {
        if (size == 0) {
            return null;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
        size--;
        if (size == 0) {
            tail = null;
        }
        return temp;

    }

    public Node removeLast() {
        if (size == 0) {
            return null;
        }
        Node temp = head;
        Node pre = head;
        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        size--;
        if (size == 0) {
            head = tail = null;
        }
        return temp;
    }

    public Node get(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;

        }
        return temp;
    }

    public boolean set(int index, int value) {
        Node temp = get(index);
        if (temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }

    public boolean insert(int index, int value) {
        if (index < 0 || index > size) {
            return false;

        }
        if (index == 0) {
            preAppend(value);
            return true;
        } else if (index == size) {
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node temp = get(index - 1);
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
        return true;
    }

    public boolean remove(int index) {
        Node temp = get(index - 1);
        if (temp != null) {
            temp.next = temp.next.next;
            size--;
            return true;
        }
        return false;

        // Second Method for Node return:-

        // if (index < 0 || index >= size) {
        // return null;
        // }
        // if (index == 0) {
        // return removeFisrt();
        // } else if (index == size - 1) {
        // return removeLast();
        // }
        // Node pre = get(index - 1);
        // Node temp = pre.next;
        // pre.next = temp.next;
        // temp.next = null;
        // size--;
        // return temp;

    }

}