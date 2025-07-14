package practice.linklist.leetCode;

public class LeetCodeDemo {
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

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;

        }

    }

    // Q1> Find Middle Node Of LinkedList
    public Node findMid() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;

    }

    public boolean hasloop() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public Node findKthNodefronEnd(int k) {
        Node fast = head;
        Node slow = head;
        for (int i = 0; i < k; i++) {
            if (fast == null) {
                return null;
            }
            fast = fast.next;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;

    }

    public void removeDuplicates() {
        if (head == null) {
            return;
        }
        Node current = head;
        while (current != null) {
            Node pre = current;
            Node runner = current.next;
            while (runner != null) {
                if (runner.val == current.val) {
                    pre.next = runner.next;
                    length--;
                } else {
                    pre = runner;
                }
                runner = runner.next;
            }
            current = current.next;
        }
    }
}
