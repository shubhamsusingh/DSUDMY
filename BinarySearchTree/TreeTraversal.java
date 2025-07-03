package BinarySearchTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TreeTraversal {
    // level-wise
    public ArrayList<Integer> BFS(BinarySearchTree.Node rootNode) {
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

    // root-left-right
    public ArrayList<Integer> DFSPreorder(BinarySearchTree.Node root) {
        ArrayList<Integer> List = new ArrayList<>();
        class Traverse {
            public Traverse(BinarySearchTree.Node currentNode) {
                List.add(currentNode.value);
                if (currentNode.left != null) {
                    new Traverse(currentNode.left);
                }
                if (currentNode.right != null) {
                    new Traverse(currentNode.right);
                }
            }
        }
        new Traverse(root);
        return List;
    }

    // left-right-root
    public ArrayList<Integer> DFSPostOrder(BinarySearchTree.Node root) {
        ArrayList<Integer> List = new ArrayList<>();
        class Traverse {
            public Traverse(BinarySearchTree.Node currentNode) {

                if (currentNode.left != null) {
                    new Traverse(currentNode.left);
                }
                if (currentNode.right != null) {
                    new Traverse(currentNode.right);

                }

                List.add(currentNode.value);

            }

        }
        new Traverse(root);
        return List;
    }

    // left=root-right
    public ArrayList<Integer> DFSInOrder(BinarySearchTree.Node root) {
        ArrayList<Integer> List = new ArrayList<>();
        class Traverse {
            public Traverse(BinarySearchTree.Node currentNode) {
                if (currentNode.left != null) {
                    new Traverse(currentNode.left);
                }
                List.add(currentNode.value);
                if (currentNode.right != null) {
                    new Traverse(currentNode.right);
                }
            }
        }
        new Traverse(root);
        return List;
    }
}
