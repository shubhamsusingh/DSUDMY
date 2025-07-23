package practice.Stack;

public class StackDemo {
    private Node top;
    private int height;

    class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
            this.next = next;
        }

    }

    public void push(int data) {
        Node newNode = new Node(data);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        height++;
    }

    public Node pop() {
        if (top == null) {
            return null;
        }
        Node temp = top;
        top = top.next;
        return temp;
    }

    public void printStack() {
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
}
