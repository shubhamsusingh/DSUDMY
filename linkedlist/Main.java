package udmyDs.linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(0);
        myLinkedList.append(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        myLinkedList.printList();
        myLinkedList.preAppend(5);
        myLinkedList.printList();
        myLinkedList.removeFisrt();
        System.out.println("RemoveData : " + myLinkedList.removeLast().value);
        myLinkedList.printList();
        System.out.println(myLinkedList.get(2).value);
        System.out.println(myLinkedList.set(2, 5));
        myLinkedList.printList();
        System.out.println(myLinkedList.insert(2, 8));
        myLinkedList.printList();
        System.out.println(myLinkedList.remove(2).value);
        myLinkedList.printList();
    }
}
