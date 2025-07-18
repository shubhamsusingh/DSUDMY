package practice.doubleLinkedList.LeetCode;

public class Question {
    public Node head;
    public Node tail;
    int length;

    class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.prev = null;
        }
    }

    public boolean append(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

        length++;
        return true;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }

    public boolean preAppend(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        length++;
        return true;
    }

    // LeetCode Problems:
    public boolean isPelindrome() {
        if (length < 1) {
            return true;
        }
        Node forward = head;
        Node backward = tail;
        for (int i = 0; i <= length / 2; i++) {
            if (forward.val != backward.val) {
                return false;
            }
            forward = forward.next;
            backward = backward.prev;
        }
        return true;
    }

    public void reverse() {
        if (length == 0) {
            return;
        }
        Node temNode = head;
        head = tail;
        tail = temNode;
        Node prev = null;
        Node after = temNode.next;
        for (int i = 0; i < length; i++) {
            after = temNode.next;
            temNode.next = prev;
            temNode.prev = after;
            prev = temNode;
            temNode = after;
        }
    }
}
