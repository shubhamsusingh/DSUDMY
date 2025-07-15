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
    }
}
