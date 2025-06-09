package hashTable;

public class Main {
    public static void main(String[] args) {
        HashTable myHashTable = new HashTable();
        // myHashTable.printTable();
        // System.out.println(myHashTable.hash("Bipin Singh"));
        // System.out.println(myHashTable.hash("shubham"));
        myHashTable.set("shubham", 24);
        myHashTable.set("sidhanshu", 22);
        myHashTable.set("rahul", 24);
        myHashTable.set("Riya", 22);
        myHashTable.set("sonali", 24);
        myHashTable.set("Gagan", 22);
        myHashTable.set("sh", 24);
        myHashTable.set("sid", 22);
        myHashTable.printTable();
        Integer age = myHashTable.get("RIYA");

        System.err.println("age of Riya: " + (age > 0 ? age : "We don't have data"));
        System.out.println(myHashTable.key());

    }
}
