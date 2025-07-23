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

    public Node get(int index) {
        if (length < index || index < 0) {
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

    public Node removeFirst() {
        if (head == null) {
            return null;
        }
        Node temp = head;
        head = head.next;
        head.prev = null;
        temp.next = null;
        length--;
        return temp;
    }

    public Node removeLast() {
        if (head == null) {
            return null;
        }
        Node temp = tail;
        tail = tail.prev;
        tail.next = null;
        temp.prev = null;
        length--;
        return temp;

    }

    public Node remove(int index) {
        if (length < index || length < 0) {
            return null;
        }
        if (index == 0) {
            Node temp = removeFirst();
            return temp;
        }
        if (index == length - 1) {
            Node temp = removeLast();
            return temp;
        }
        Node prev = get(index - 1);
        if (prev != null) {
            Node removed = prev.next;
            prev.next = prev.next.next;
            prev.next.next.prev = prev;
            removed.next = null;
            removed.prev = null;
            return removed;
        }
        return null;

    }
}
