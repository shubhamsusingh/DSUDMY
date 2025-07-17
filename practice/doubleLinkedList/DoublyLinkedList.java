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

    public Node removeLast() {
        if (head == null) {
            return null;
        }

        Node temp = tail;
        if (length == 1) {
            head = tail = null;
        } else {
            tail = tail.prev;
            temp.prev = null;
            temp.next = null;
            tail.next = null;
        }
        length--;
        return temp;
    }

    public Node removeFirst() {
        if (head == null) {
            return null;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        return temp;

    }

    public Node get(int index) {
        if (index < 0 || index >= length) {
            return null;
        }
        Node temp = head;
        if (index < length / 2) {
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        } else {
            temp = tail;
            for (int i = length - 1; i > index; i--) {
                temp = temp.prev;
            }
        }
        return temp;
    }

    public boolean set(int index, int val) {
        Node temp = get(index);
        if (temp != null) {
            temp.val = val;
            return true;
        }
        return false;
    }
}
