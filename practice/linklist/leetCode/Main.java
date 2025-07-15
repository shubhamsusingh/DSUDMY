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
        LeetCodeDemo ld1 = new LeetCodeDemo();
        ld1.append(1);
        ld1.append(0);
        ld1.append(1);
        System.out.println("Binary to decimal : " + ld1.binaryToDecimal(ld1.getHead()));
        LeetCodeDemo dummy = new LeetCodeDemo();
        dummy.append(3);
        dummy.append(8);
        dummy.append(5);
        dummy.append(10);
        dummy.append(2);
        dummy.append(1);
        System.out.println("Raw Dummy Data : ");
        dummy.printList();
        System.out.println("After Partion of List : ");
        dummy.partionList(5);
        dummy.printList();
        System.out.println("after reverse between : ");
        dummy.reverseBetween(1, 4);
        dummy.printList();

    }

}
