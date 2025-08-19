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

    public Node getRoot() {
        return root;
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

    // recursive method:-
    private boolean rContains(Node currentNode, int val) {
        if (currentNode == null) {
            return false;
        }
        if (currentNode.val == val) {
            return true;
        }
        if (val < currentNode.val) {
            return rContains(currentNode.left, val);
        } else {
            return rContains(currentNode.right, val);
        }

    }

    public boolean rContains(int val) {
        return rContains(root, val);
    }

    private Node rInsert(Node currentNode, int val) {
        if (currentNode == null) {
            return new Node(val);
        }
        if (val < currentNode.val) {
            currentNode.left = rInsert(currentNode.left, val);
        } else if (val > currentNode.val) {
            currentNode.right = rInsert(currentNode.right, val);
        }
        return currentNode;
    }

    public void rInsert(int val) {
        if (root == null) {
            Node newNode = new Node(val);
            root = newNode;
        }
        rInsert(root, val);
    }

    public int minValue(Node currentNode) {
        while (currentNode.left != null) {
            currentNode = currentNode.left;
        }
        return currentNode.val;
    }

    private Node delete(Node currentNode, int val) {
        if (currentNode == null) {
            return null;
        }
        if (val < currentNode.val) {
            currentNode.left = delete(currentNode.left, val);
        } else if (val > currentNode.val) { // ✅ missing condition added
            currentNode.right = delete(currentNode.right, val);
        } else {
            if (currentNode.left == null && currentNode.right == null) {
                return null;
            } else if (currentNode.left == null) {
                currentNode = currentNode.right;
            } else if (currentNode.right == null) {
                currentNode = currentNode.left;
            } else {
                int subTreeMin = minValue(currentNode.right);
                currentNode.val = subTreeMin;
                currentNode.right = delete(currentNode.right, subTreeMin);
            }
        }
        return currentNode;
    }

    public boolean delete(int val) {
        Node deleted = delete(root, val);
        if (deleted != null) {
            return true;
        } else {
            return false;
        }
    }
}
