package DSUDMY.queue;

public class Queue {
    private Node first;
    private Node last;
    private int length;

    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public Queue(int value) {
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length = 1;
    }

    public void printQueue() {
        if (length == 0) {
            System.out.println("there is no any Data");
            return;
        }
        Node temp = first;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
        return;
    }

    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        length++;
    }

    public Node deQueue() {
        if (length == 0) {
            return null;
        }
        Node temp = first;
        if (length == 1) {
            first = last = null;
        } else {
            first = first.next;
            temp.next = null;
        }
        length--;
        return temp;
    }
}
