package practice.Tree.leetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Treedemo {
    private Node root;

    class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public boolean insert(int val) {
        Node newNode = new Node(val);
        if (root == null) {
            root = newNode;
            return true;
        }
        Node currentNode = root;
        while (true) {
            if (newNode.val == currentNode.val) {
                return false;
            }
            if (newNode.val < currentNode.val) {
                if (currentNode.left == null) {
                    currentNode.left = newNode;
                    return true;
                }
                currentNode = currentNode.left;
            } else {
                if (currentNode.right == null) {
                    currentNode.right = newNode;
                    return true;
                }
                currentNode = currentNode.right;
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
            public Traverse(Node currentNode) {
                if (currentNode.left != null) {
                    new Traverse(currentNode.left);
                }
                if (currentNode.right != null) {
                    new Traverse(currentNode.right);
                }
                result.add(currentNode.val);
            }
        }
        new Traverse(root);
        return result;
    }

}
