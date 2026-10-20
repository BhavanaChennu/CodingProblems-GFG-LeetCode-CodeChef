# Path Exists

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given an undirected graph with  **V** vertices numbered from  **0**  to  **V-1**  and **E**  edges, represented as a 2D array  **edges[][]**, where each element  **edges[i] = [u, v]**  represents an undirected edge between vertex u and vertex v.

You are also given two vertices:  **src**  and  **dest**. Determine if there exists a path from src to dest.

Return "true" if a path exists, and "false" otherwise.

 **Examples:** 

```
Input: V = 6, E = 4, edges[][] = [[0, 2], [1, 2], [0, 3], [4, 5]], src = 1, dest = 5

Output: false
Explanation: There is no path from vertex 1 to vertex 5.
```

```
Input: V = 6, E = 4, edges[][] = [[0, 2], [1, 2], [0, 3], [4, 5]], src = 2, dest = 3

Output: true
Explanation: We can reach vertex 3 from vertex 2 via vertex 0.

```

**Constraints:
**1 ≤ V, E ≤ 105
0 ≤ edges[i][0], edges[i][1] < V
0 ≤ src, dest < V

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-20T09:13:21.856Z  

```java
class Solution {
    public boolean checkPath(int V, int[][] edges, int src, int dest) {
        // Code here
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int u = edge[0], v = edge[1];

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        boolean[] visited = new boolean[V];

        if (!visited[src]) {
            dfs(graph, V, src, visited);
        }

        return visited[dest];
    }

    private void dfs(List<List<Integer>> graph, int V, int src, boolean[] visited) {
        visited[src] = true;

        for (int neigh : graph.get(src)) {
            if (!visited[neigh]) {
                dfs(graph, V, neigh, visited);
            }
        }
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/path-exists/1)