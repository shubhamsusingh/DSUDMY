package practice.linklist;

public class LinkedListDemo {
    public Node head;
    public Node tail;
    int length;

    class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public void append(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
        length++;
    }

    public void preAppend(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = tail = newNode;
        }
        newNode.next = head;
        head = newNode;
        length++;
    }

    public Node removeFirst() {
        if (head == null) {
            return null;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
        if (length == 1) {
            tail = null;
        }
        length--;
        return temp;

    }

    public Node removeLast() {
        if (head == null) {
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
        length--;
        if (length == 0) {
            head = tail = null;
        }
        return temp;

    }

    public Node get(int index) {
        if (index < 0 || index > length) {
            return null;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public boolean set(int index, int val) {
        Node nodeIndex = get(index);
        if (nodeIndex != null) {
            nodeIndex.val = val;
            return true;
        }
        return false;
    }

    public boolean insert(int index, int val) {
        if (index < 0 | index > length) {
            return false;
        }
        if (index == 0) {
            preAppend(val);
            return true;
        }
        if (index == length) {
            append(val);
            return true;
        }
        Node indexNode = get(index - 1);
        Node newNode = new Node(val);
        newNode.next = indexNode.next;
        indexNode.next = newNode;
        length++;
        return true;

    }

    public Node remove(int index) {
        if (index < 0 || index > length) {
            return null;
        }
        if (index == 0) {
            return removeFirst();
        } else if (index == length - 1) {
            return removeLast();
        }
        Node pre = get(index - 1);
        Node temp = pre.next;
        pre.next = temp.next;
        temp.next = null;
        length--;
        return temp;
    }

    public void reverse() {
        Node temp = head;
        head = tail;
        tail = temp;
        Node after = temp.next;
        Node before = null;
        for (int i = 0; i < length; i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
}
