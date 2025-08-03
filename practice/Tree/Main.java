package practice.Tree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(21);
        bst.insert(40);
        bst.insert(4);
        bst.insert(24);
        bst.insert(60);
        bst.insert(22);
        bst.insert(2);
        bst.insert(6);
        System.out.println(bst.contains(24));
        System.out.println("BFS : " + bst.BFS().toString());
        System.out.println("DFS PreOrder : " + bst.DFSPreeOrder().toString());
        System.out.println("DFSInOrder : " + bst.DFSInOrder().toString());
    }
}
