package Assignment4;


public class Main {
    public static void main(String[] args) {
        WeightedGraph graph = new WeightedGraph();

        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");

        graph.addEdge("A", "B", 2);
        graph.addEdge("A", "C", 5);
        graph.addEdge("B", "C", 1);
        graph.addEdge("B", "D", 4);
        graph.addEdge("C", "D", 1);

        System.out.println("BFS from A:");
        graph.bfs("A");

        System.out.println("\nDijkstra from A:");
        Map<String, Double> distances = graph.dijkstra("A");
        for (Map.Entry<String, Double> entry : distances.entrySet()) {
            System.out.println("Distance to " + entry.getKey() + ": " + entry.getValue());
        }
    }
}
