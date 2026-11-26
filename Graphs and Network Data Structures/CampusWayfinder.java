import java.util.*;

class Graph {

    final Map<String, List<String>> adj = new HashMap<>();

    public void addEdge(String u, String v) {
        adj.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
        adj.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
    }

    public void printAdjacency() {
        System.out.println("Adjacency list: ");
        for (Map.Entry<String, List<String>> e : adj.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }

    public void dfs(String start) {
        dfs(start, new HashSet<>());
        System.out.println();
    }

    void dfs(String u, Set<String> visited) {
        visited.add(u);
        System.out.print(u + " ");
        for (String v : adj.getOrDefault(u, new ArrayList<>())) {
            if (!visited.contains(v)) {
                dfs(v, visited);
            }
        }
    }

    public void bfs(String start, String target) {
        Set<String> visited = new HashSet<>();
        Queue<String> queue = new ArrayDeque<>();
        Map<String, String> parent = new HashMap<>();

        visited.add(start);
        queue.add(start);

        System.out.print("BFS Visitation order: ");
        while (!queue.isEmpty()) {
            String u = queue.poll();
            System.out.print(u + " ");
            if (u.equals(target)) {
                break;
            }

            for (String v : adj.getOrDefault(u, new ArrayList<>())) {
                if (!visited.contains(v)) {
                    visited.add(v);
                    parent.put(v, u);
                    queue.add(v);
                }
            }
        }
        System.out.println();

        if (!visited.contains(target)) {
            System.out.println("No path from " + start + " to " + target);
            return;
        }
        List<String> path = new ArrayList<>();
        for (String at = target; at != null; at = parent.get(at)) {
            path.add(at);
        }
        Collections.reverse(path);
        System.out.println("BFS shortest path from " + start + " to " + target + ": " + path);
    }
}


import java.util.*;

class CampusWayfinder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Graph g = new Graph();

        g.addEdge("A", "B");
        g.addEdge("A", "C");
        g.addEdge("B", "D");
        g.addEdge("C", "D");

        g.printAdjacency();
        System.out.print("\nEnter start vertex for DFS: ");
        String start = sc.next().toUpperCase();
        System.out.print("DFS order: ");
        g.dfs(start);

        System.out.print("\nEnter start and target vertices for BFS: ");
        String s = sc.next().toUpperCase();
        String t = sc.next().toUpperCase();
        g.bfs(s, t);
    }
}
