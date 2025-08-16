package practice.HashTable.leetCode.Graph;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex("A");
        graph.printadjList();
        graph.addVertex("B");
        graph.addEdges("A", "B");
        graph.printadjList();
        graph.removeEdges("A", "B");
        graph.printadjList();
        // graph.removeVertex("A");
        graph.printadjList();
    }
}
