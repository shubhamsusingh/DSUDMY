package practice.HashTable;

public class Main {
    public static void main(String[] args) {
        HashMapDemo hmap = new HashMapDemo();
        System.out.println("Empty table : ");
        hmap.PrintTable();
        hmap.set("shubham", 340);
        System.out.println("Print 340 : ");
        hmap.PrintTable();
        System.out.println("Print 350 : ");
        hmap.set("dev", 350);
        hmap.set("rahul", 10);
        hmap.PrintTable();
        System.out.println("this is the value of Key Shubham : " + hmap.get("shubham"));
    }
}
