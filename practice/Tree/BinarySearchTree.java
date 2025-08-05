package practice.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
    private Node root;

    class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
            left = null;
            right = null;
        }
    }

    public boolean insert(int val) {
        Node newNode = new Node(val);
        if (root == null) {
            root = newNode;
            return true;
        }
        Node temp = root;
        while (true) {
            if (temp.val == newNode.val) {
                return false;
            }
            if (newNode.val < temp.val) {
                if (temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            } else {
                if (temp.right == null) {
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }
    }

    public boolean contains(int val) {
        Node temp = root;
        while (temp != null) {
            if (val < temp.val) {
                temp = temp.left;
            } else if (val > temp.val) {
                temp = temp.right;
            } else {
                return true;
            }
        }
        return false;
    }

    public ArrayList<Integer> BFS() {
        Node currentNode = root;
        Queue<Node> queue = new LinkedList<>();
        ArrayList<Integer> result = new ArrayList<>();
        queue.add(root);
        while (queue.size() > 0) {
            currentNode = queue.remove();
            result.add(currentNode.val);
            if (currentNode.left != null) {
                queue.add(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.add(currentNode.right);
            }
        }
        return result;
    }

    public ArrayList<Integer> DFSPreeOrder() {
        ArrayList<Integer> result = new ArrayList<>();
        class Traverse {
            public Traverse(Node currentNode) {
                result.add(currentNode.val);
                if (currentNode.left != null) {
                    new Traverse(currentNode.left);

                }
                if (currentNode.right != null) {
                    new Traverse(currentNode.right);
                }
            }
        }
        new Traverse(root);
        return result;
    }

    public ArrayList<Integer> DFSInOrder() {
        ArrayList<Integer> result = new ArrayList<>();
        class Traverse {
            public Traverse(Node currentNode) {
                if (currentNode.left != null) {
                    new Traverse(currentNode.left);
                }
                result.add(currentNode.val);
                if (currentNode.right != null) {
                    new Traverse(currentNode.right);
                }
            }
        }
        new Traverse(root);
        return result;
    }

    public ArrayList<Integer> DFSPostOrder() {
        ArrayList<Integer> result = new ArrayList<>();
        class Traverse {
            public Traverse(Node currNode) {
                if (currNode.left != null) {
                    new Traverse(currNode.left);
                }
                if (currNode.right != null) {
                    new Traverse(currNode.right);
                }
                result.add(currNode.val);
            }
        }
        new Traverse(root);
        return result;
    }
}
