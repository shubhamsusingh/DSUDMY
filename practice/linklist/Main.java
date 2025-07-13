package practice.linklist;

public class Main {
    public static void main(String[] args) {
        LinkedListDemo ll = new LinkedListDemo();
        ll.append(1);
        ll.append(2);
        ll.append(3);
        ll.append(4);
        System.out.println("Append");
        ll.printList();
        System.out.println("Length of List :" + ll.length);
        ll.preAppend(0);
        System.out.println("PreAppend");
        ll.printList();
        System.out.println("Length of List :" + ll.length);
        System.out.println("RemoveFirst");
        System.out.println("Removed Data : " + ll.removeFirst().val);
        ll.printList();
        System.out.println("Length of List :" + ll.length);
        System.out.println("Removed Data From last : " + ll.removeLast().val);
        ll.printList();
        System.out.println("2 Index Data : " + ll.get(2).val);
        System.out.println("insert Data at 2 index : " + ll.insert(2, 5));
        ll.printList();
        System.out.println("Removed Data : " + ll.remove(2).val);
        ll.printList();
        System.out.println("reversed LinkedList : ");
        ll.reverse();
        ll.printList();

    }
}
