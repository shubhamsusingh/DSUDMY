package BinarySearchTree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(5);
        bst.insert(6);
        System.out.println(bst.insert(1));
        System.out.println(bst.insert(1));
        System.out.println(bst.contains(1));
    }
}
