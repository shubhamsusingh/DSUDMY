package practice.Tree.leetCode;

public class Main {
    public static void main(String[] args) {
        Treedemo tree = new Treedemo();
        tree.insert(10);
        tree.insert(9);
        tree.insert(8);
        tree.insert(7);
        tree.insert(6);
        tree.insert(5);
        tree.insert(4);
        tree.insert(3);
        tree.insert(2);
        tree.insert(1);
        tree.insert(15);
        tree.insert(12);
        System.out.println("BFS" + tree.BFS());
        System.out.println(tree.contains(10));
        System.out.println("DFSPreeOrder" + tree.DFSPreeOrder());
        System.out.println("DFSInOrder" + tree.DFSInOrder());
        System.out.println("DFSPostOrder" + tree.DFSPostOrder());
    }
}
