package BinarySearchTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TreeTraversal {
    public ArrayList<Integer> BFS(BinarySearchTree.Node rootNode) {
        // BinarySearchTree bst = new BinarySearchTree();
        // BinarySearchTree.Node currentNode = bst.getRoot();
        // System.out.println(currentNode.value);
        BinarySearchTree.Node currentNode = rootNode;
        Queue<BinarySearchTree.Node> queue = new LinkedList<>();
        ArrayList<Integer> result = new ArrayList<>();
        queue.add(currentNode);
        while (queue.size() > 0) {
            currentNode = queue.remove();
            result.add(currentNode.value);
            if (currentNode.left != null) {
                queue.add(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.add(currentNode.right);
            }

        }
        return result;
    }
}
