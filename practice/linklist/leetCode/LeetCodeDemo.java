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

    public Node getHead() {
        return head;
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

    public int binaryToDecimal(Node currentNode) {
        int num = 0;
        Node temp = head;
        while (temp != null) {
            num = num * 2 + temp.val;
            temp = temp.next;
        }
        return num;
    }

    public void partionList(int value) {
        Node dummy1 = new Node(0);
        Node dummy2 = new Node(0);
        Node d1 = dummy1;
        Node d2 = dummy2;
        Node temp = head;
        while (temp != null) {
            if (temp.val < value) {
                d1.next = temp;
                d1 = temp;
            } else {
                d2.next = temp;
                d2 = temp;
            }
            temp = temp.next;
        }
        d2.next = null;
        d1.next = dummy2.next;
        head = dummy1.next;

    }

    public void reverseBetween(int start, int end) {
        if (head == null)
            return;
        Node dummy = new Node(0);
        dummy.next = head;
        Node previous = dummy;
        for (int i = 0; i < start; i++) {
            previous = previous.next;
        }
        Node currentNode = previous.next;
        for (int i = 0; i < end - start; i++) {
            Node nodetoMove = currentNode.next;
            currentNode.next = nodetoMove.next;
            nodetoMove.next = previous.next;
            previous.next = nodetoMove;
        }
        head = dummy.next;
    }

}
