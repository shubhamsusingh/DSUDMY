package DSUDMY.queue;

public class Main {
    public static void main(String[] args) {
        Queue q = new Queue(0);
        q.printQueue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.deQueue();
        q.deQueue();
        q.printQueue();
    }
}
