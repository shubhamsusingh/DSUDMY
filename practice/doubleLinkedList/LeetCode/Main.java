package practice.doubleLinkedList.LeetCode;

public class Main {
    public static void main(String[] args) {
        Question qt = new Question();
        qt.append(1);
        qt.append(2);
        qt.append(3);
        qt.append(4);
        qt.append(5);
        qt.preAppend(0);
        qt.printList();
        System.out.println(qt.isPelindrome());
        qt.reverse();
        qt.printList();
        System.out.println("removed Data" + qt.remove(2).val);
        qt.printList();
    }
}
