package practice.Stack;

public class Main {
    public static void main(String[] args) {
        StackDemo stack = new StackDemo();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.printStack();
        System.out.println("removed Data" + stack.pop());
        stack.printStack();
    }
}
