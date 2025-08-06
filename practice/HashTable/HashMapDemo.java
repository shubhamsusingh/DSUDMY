package practice.HashTable;

public class HashMapDemo {
    private int size = 7;
    private Node[] datamap;

    class Node {
        int val;
        String key;
        Node next;

        public Node(String key, int val) {
            this.key = key;
            this.val = val;
            this.next = null;
        }

    }

    public HashMapDemo() {
        datamap = new Node[size];
    }

    public void PrintTable() {
        for (int i = 0; i < datamap.length; i++) {
            System.out.println(i + ":");
            Node currentNode = datamap[i];
            while (currentNode != null) {
                System.out.println(currentNode.val);
                currentNode = currentNode.next;
            }

        }
    }

    public int hash(String key) {
        int hash = 0;
        char[] charArray = key.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            int asciiValue = charArray[i];
            hash = (hash + asciiValue * 23) % charArray.length;
        }
        return hash;
    }

    public void set(String key, int val) {
        int index = hash(key);
        Node newNode = new Node(key, val);
        if (datamap[index] == null) {
            datamap[index] = newNode;
        } else {
            Node temp = datamap[index];
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public int get(String key) {
        int index = hash(key);
        Node tenp = datamap[index];
        while (tenp != null) {
            if (tenp.key == key) {
                return tenp.val;
            }
            tenp = tenp.next;
        }
        return 0;
    }

}
