package BinarySearchTree;

public class BinarySearchTree {
    Node root;

    class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    public boolean insert(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return true;
        }
        Node temp = root;
        while (true) {
            if (temp.value == newNode.value) {
                return false;
            }
            if (newNode.value < temp.value) {
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

    public boolean contains(int value) {
        Node temp = root;
        while (temp != null) {
            if (value < temp.value) {
                temp = temp.left;
            } else if (value > temp.value) {
                temp = temp.right;
            } else {
                return true;
            }
        }
        return false;
    }

    // tis is for recursive check:-

    private boolean rContains(Node cRootNode, int value) {
        if (cRootNode == null) {
            return false;
        }
        if (cRootNode.value == value) {
            return true;
        }
        if (cRootNode.value > value) {
            return rContains(cRootNode.left, value);
        } else {
            return rContains(cRootNode.right, value);
        }
    }

    public boolean rContains(int value) {
        return rContains(root, value);
    }

    // this is for recursive Insert:-

    private Node rInsert(Node currRootNode, int value) {
        if (currRootNode == null) {
            return new Node(value);
        }
        if (value < currRootNode.value) {
            currRootNode.left = rInsert(currRootNode.left, value);
        } else if (value > currRootNode.value) {
            currRootNode.right = rInsert(currRootNode.right, value);
        }
        return currRootNode;
    }

    public void rInsert(int value) {
        if (root == null) {
            root = new Node(value);
        }
        rInsert(root, value);
    }

    // Delete Node using Recursion:-
    private Node DeleteNode(Node currentNode, int value) {
        if (currentNode == null) {
            return null;
        }
        if (value < currentNode.value) {
            currentNode.left = DeleteNode(currentNode.left, value);
        } else if (value > currentNode.value) {
            currentNode.right = DeleteNode(currentNode.right, value);
        } else {
            if (currentNode.left == null && currentNode.right == null) {
                currentNode = null;
            } else if (currentNode.left == null) {
                currentNode = currentNode.right;
            } else if (currentNode.right == null) {
                currentNode = currentNode.left;
            } else {
                int subTreemin = minValue(currentNode.right);
                currentNode.value = subTreemin;
                currentNode.right = DeleteNode(currentNode.right, subTreemin);
            }
        }
        return currentNode;
    }

    private int minValue(Node currentNode) {
        while (currentNode.left != null) {
            currentNode = currentNode.left;
        }
        return currentNode.value;
    }

    public void deleteNode(int value) {
        DeleteNode(root, value);
    }

}
