package graph;

public class Main {
    public static void main(String[] args) {
        GraphDemo gm = new GraphDemo();
        gm.addvertex("A");
        gm.addvertex("B");
        gm.addvertex("C");
        gm.addvertex("D");
        gm.printGraph();
        gm.addEdge("A", "B");
        gm.addEdge("B", "C");
        gm.addEdge("C", "D");
        gm.addEdge("D", "A");
        gm.printGraph();
        gm.removeEdge("A", "B");
        gm.printGraph();
        gm.removeremoveVertex("A");
        gm.printGraph();

    }
}
