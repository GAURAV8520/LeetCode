
class Solution {
    
    // Check if it's safe to color the node with a specific color
    private static boolean isSafe(int node, List<Integer>[] G, int color[], int currentColor) {
        for (int adjacentNode : G[node]) {
            if (color[adjacentNode] == currentColor) {
                return false; // Adjacent node has the same color
            }
        }
        return true;
    }
    
    // Recursive function to solve the graph coloring problem
    private static boolean solve(int node, List<Integer>[] G, int m, int color[]) {
        // Base case: all nodes are colored
        if (node == G.length) {
            return true;
        }
        
        // Try different colors for the current node
        for (int currentColor = 1; currentColor <= m; currentColor++) {
            if (isSafe(node, G, color, currentColor)) {
                color[node] = currentColor; // Assign color
                
                // Recursively try to color the next node
                if (solve(node + 1, G, m, color)) {
                    return true;
                }
                
                // Backtrack: Reset the color if it doesn't lead to a solution
                color[node] = 0;
            }
        }
        return false;
    }
    
    // Main function to create adjacency list and start the graph coloring process
    public static boolean graphColoring(int v, List<int[]> edges, int m) {
        // Create the adjacency list
        List<Integer>[] G = new ArrayList[v];
        for (int i = 0; i < v; i++) {
            G[i] = new ArrayList<>();
        }
        
        // Fill the adjacency list from the edges
        for (int[] edge : edges) {
            G[edge[0]].add(edge[1]);
            G[edge[1]].add(edge[0]);
        }
        
        // Initialize color array
        int[] color = new int[v];
        
        // Start solving from the first node (node 0)
        return solve(0, G, m, color);
    }
}
