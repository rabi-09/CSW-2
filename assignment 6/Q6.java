import java.util.ArrayList;
import java.util.List;

class GraphMatrix {
    int vertices;
    int[][] adjMatrix;

    GraphMatrix(int vertices) {
        this.vertices = vertices;
        adjMatrix = new int[vertices][vertices];
    }

    void addEdge(int u, int v) {
        adjMatrix[u][v] = 1;
        adjMatrix[v][u] = 1;  
    }

    void displayAdjMatrix() {
        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class GraphList {
    int vertices;
    List<List<Integer>> adjList;

    GraphList(int vertices) {
        this.vertices = vertices;
        adjList = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    void addEdge(int u, int v) {
        adjList.get(u).add(v);
        adjList.get(v).add(u);  
    }

    void displayAdjList() {
        System.out.println("Adjacency List:");
        for (int i = 0; i < vertices; i++) {
            System.out.print(i + ": ");
            for (Integer vertex : adjList.get(i)) {
                System.out.print(vertex + " ");
            }
            System.out.println();
        }
    }
}

public class Q6 {
    public static void main(String[] args) {
        GraphMatrix graphMatrix = new GraphMatrix(5);
        graphMatrix.addEdge(0, 1);
        graphMatrix.addEdge(0, 4);
        graphMatrix.addEdge(1, 2);
        graphMatrix.addEdge(1, 3);
        graphMatrix.addEdge(1, 4);
        graphMatrix.addEdge(2, 3);
        graphMatrix.addEdge(3, 4);

        graphMatrix.displayAdjMatrix();

        GraphList graphList = new GraphList(5);
        graphList.addEdge(0, 1);
        graphList.addEdge(0, 4);
        graphList.addEdge(1, 2);
        graphList.addEdge(1, 3);
        graphList.addEdge(1, 4);
        graphList.addEdge(2, 3);
        graphList.addEdge(3, 4);

        graphList.displayAdjList();
    }
}
