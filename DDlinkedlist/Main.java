package DSUDMY.DDlinkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList dlist = new LinkedList(0);
        dlist.append(1);
        dlist.append(2);
        dlist.append(3);
        dlist.append(4);
        dlist.append(5);
        dlist.printDList();
        dlist.printRev();
        System.out.println("removed from Last : " + dlist.removeLast().value);
        dlist.printDList();
        dlist.preAppend(8);
        dlist.printDList();
    }
}
