package multiThreding;

public class MultiThredingDemo extends Thread {
    private int myTreadNo;

    public MultiThredingDemo(int myTreadNo) {
        this.myTreadNo = myTreadNo;
    }

    public void run() {
        try {
            countMe();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void countMe() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            System.out.println("ThreadNo : " + myTreadNo + "interruptionNumber" + i);
        }
    }
}

class Main {
    public static void main(String[] args) {
        MultiThredingDemo t1 = new MultiThredingDemo(1);
        MultiThredingDemo t2 = new MultiThredingDemo(2);
        t1.start();
        t2.start();
    }
}
