package BinarySearchTree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(5);
        bst.insert(6);
        System.out.println(bst.insert(1));
        System.out.println(bst.insert(1));
        System.out.println(bst.contains(1));
        System.out.println(bst.rContains(4));
        bst.rInsert(4);
        System.out.println(bst.rContains(4));
        // System.out.println(bst.contains(1));
        bst.deleteNode(4);
        System.out.println(bst.contains(4));
    }
}
