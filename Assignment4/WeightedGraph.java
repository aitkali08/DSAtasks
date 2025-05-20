package Assignment4;

import java.util.*;

public class WeightedGraph {
    Map<String, Vertex> vertices = new HashMap<>();

    public void addVertex(String label) {
        vertices.putIfAbsent(label, new Vertex(label));
    }

    public void addEdge(String fromLabel, String toLabel, double weight) {
        Vertex from = vertices.get(fromLabel);
        Vertex to = vertices.get(toLabel);
        if (from != null && to != null) {
            from.addNeighbor(to, weight);
        }
    }

    public Vertex getVertex(String label) {
        return vertices.get(label);
    }

    // -------- BFS --------
    public void bfs(String startLabel) {
        Vertex start = vertices.get(startLabel);
        if (start == null) return;

        Set<Vertex> visited = new HashSet<>();
        Queue<Vertex> queue = new LinkedList<>();
        queue.add(start);
        visited.add(start);

        while (!queue.isEmpty()) {
            Vertex current = queue.poll();
            System.out.print(current.label + " ");

            for (Pair<Vertex, Double> neighborPair : current.neighbors) {
                Vertex neighbor = neighborPair.getKey();
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
        System.out.println();
    }

    // -------- Dijkstra --------
    public Map<String, Double> dijkstra(String startLabel) {
        Vertex start = vertices.get(startLabel);
        if (start == null) return null;

        Map<Vertex, Double> distances = new HashMap<>();
        for (Vertex v : vertices.values()) {
            distances.put(v, Double.POSITIVE_INFINITY);
        }
        distances.put(start, 0.0);

        PriorityQueue<Pair<Vertex, Double>> pq = new PriorityQueue<>(Comparator.comparingDouble(Pair::getValue));
        pq.add(new Pair<>(start, 0.0));

        while (!pq.isEmpty()) {
            Pair<Vertex, Double> currentPair = pq.poll();
            Vertex current = currentPair.getKey();
            double currentDist = currentPair.getValue();

            for (Pair<Vertex, Double> neighborPair : current.neighbors) {
                Vertex neighbor = neighborPair.getKey();
                double weight = neighborPair.getValue();
                double newDist = currentDist + weight;

                if (newDist < distances.get(neighbor)) {
                    distances.put(neighbor, newDist);
                    pq.add(new Pair<>(neighbor, newDist));
                }
            }
        }

        // Convert to String-Double map for output
        Map<String, Double> result = new HashMap<>();
        for (Map.Entry<Vertex, Double> entry : distances.entrySet()) {
            result.put(entry.getKey().label, entry.getValue());
        }
        return result;
    }
}
