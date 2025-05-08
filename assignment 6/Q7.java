import java.util.*;

class Graph {
    int vertices;
    LinkedList<Integer>[] adjList;

    Graph(int vertices) {
        this.vertices = vertices;
        adjList = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    void addEdge(int src, int dest) {
        adjList[src].add(dest);
        adjList[dest].add(src);
    }

    void dfs(int start) {
        boolean[] visited = new boolean[vertices];
        System.out.println("DFS Traversal:");
        dfsRecursive(start, visited);
        System.out.println();
    }

    void dfsRecursive(int vertex, boolean[] visited) {
        visited[vertex] = true;
        System.out.print(vertex + " ");
        for (int neighbor : adjList[vertex]) {
            if (!visited[neighbor]) {
                dfsRecursive(neighbor, visited);
            }
        }
    }

    void displayGraph() {
        System.out.println("Adjacency List:");
        for (int i = 0; i < vertices; i++) {
            System.out.print(i + ": ");
            for (int node : adjList[i]) {
                System.out.print(node + " ");
            }
            System.out.println();
        }
    }
}

public class Q7 {
    public static void main(String[] args) {
        Graph graph = new Graph(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        graph.displayGraph();
        graph.dfs(0);
    }
}
