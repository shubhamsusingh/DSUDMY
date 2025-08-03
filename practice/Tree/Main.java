package practice.Tree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(21);
        bst.insert(40);
        bst.insert(4);
        bst.insert(24);
        System.out.println(bst.contains(24));
        System.out.println("BFS : " + bst.BFS().toString());
    }
}
