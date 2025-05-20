package Assignment4;

import java.util.*;

public class Vertex {
    String label;
    List<Pair<Vertex, Double>> neighbors;

    public Vertex(String label) {
        this.label = label;
        this.neighbors = new ArrayList<>();
    }

    public void addNeighbor(Vertex neighbor, double weight) {
        neighbors.add(new Pair<>(neighbor, weight));
    }

    @Override
    public String toString() {
        return label;
    }
}
