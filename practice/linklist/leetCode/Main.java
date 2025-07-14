package practice.linklist.leetCode;

public class Main {
    public static void main(String[] args) {
        LeetCodeDemo ld = new LeetCodeDemo();
        ld.append(1);
        ld.append(2);
        ld.append(3);
        ld.append(4);
        ld.append(5);
        System.out.println("append : ");
        ld.printList();
        ld.preAppend(0);
        System.out.println("PreAppend");
        ld.printList();
        System.out.println("Mid Node : " + ld.findMid().val);
        System.out.println("LinkedList has Loop or Not : " + ld.hasloop());
        System.out.println("K th Node from Last : " + ld.findKthNodefronEnd(3).val);
        System.out.println("Add Some Duplicated Data");
        ld.append(1);
        ld.append(5);
        ld.printList();
        ld.removeDuplicates();
        System.out.println("remove duolicates");
        ld.printList();
    }
}
