import java.util.ArrayList;

// Clase Graph que representa el grafo
public class Graph {
    private ArrayList<Vertex> vertices;
    private boolean[][] adjacencyMatrix;
    private int vertexCount;

    public Graph(int maxVertices) {
        vertices = new ArrayList<>();
        adjacencyMatrix = new boolean[maxVertices][maxVertices];
        vertexCount = 0;
    }

    public void addVertex(Vertex v) {
        vertices.add(v);
    }

    public void addEdge(int v1, int v2) {
        if (v1 < vertexCount && v2 < vertexCount) {
            adjacencyMatrix[v1][v2] = true;
            adjacencyMatrix[v2][v1] = true;  // Para grafos no dirigidos
        }
    }

    public ArrayList<Vertex> getVertices() {
        return vertices;
    }

    public boolean[][] getAdjacencyMatrix() {
        return adjacencyMatrix;
    }

    public int getVertexCount() {
        return vertexCount;
    }

    public String getNextVertexLabel() {
        return String.valueOf((char) ('A' + vertexCount++));
    }
}