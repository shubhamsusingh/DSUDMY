package practice.doubleLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dbList = new DoublyLinkedList();
        dbList.append(1);
        dbList.append(2);
        dbList.append(3);
        dbList.printList();
        System.out.println("PreAppend : ");
        dbList.preAppend(1);
        dbList.preAppend(0);
        dbList.printList();
        System.out.println("removed data from Last : ");
        dbList.removeLast();
        dbList.printList();
        System.out.println("Remove First : ");
        dbList.removeFirst();
        dbList.printList();
        System.out.println("first Index data : " + dbList.get(1).val);
        System.out.println("Now set 5 to index 1 ");
        dbList.set(0, 5);
        dbList.printList();

    }
}
