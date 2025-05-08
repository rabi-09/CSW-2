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

    public void displayAdjList() {
        System.out.println("Adjacency List:");
        for (int i = 0; i < vertices; i++) {
            System.out.print(i + ": ");
            for (int n : adjList[i]) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }

    void bfs(int start) {
        boolean[] visited = new boolean[vertices];
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        visited[start] = true;
        queue.add(start);
        System.out.println("BFS Traversal:");
        while (!queue.isEmpty()) {
            int current = queue.poll();
            System.out.print(current + " ");
            for (int neighbor : adjList[current]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
        System.out.println();
    }
}

public class Q8 {
    public static void main(String[] args) {
        Graph graph = new Graph(6);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 4);
        graph.addEdge(3, 5);
        graph.addEdge(4, 5);

        graph.displayAdjList();
        graph.bfs(0);
    }
}
