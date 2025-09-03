class Solution {
    public boolean isBipartite(int[][] graph) {
        // Code here
        int V = graph.length;
        int color[] = new int[V];
        Arrays.fill(color, -1);

        for (int i = 0; i < V; i++) {
            if (color[i] == -1) {
                if (!colorBfs(i, graph, color)) {
                    return false;
                }
            }
        }
        return true;
    }

    //create an function for bfs call 
    private boolean colorBfs(int src, int edges[][], int[] color) {
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        color[src] = 0;//assign the red color
        //red color=0 green color=1
        while (q.size() > 0) {
            int node = q.poll();
            for (int neighbour : edges[node]) {
                if (color[neighbour] == -1) {
                    color[neighbour] = 1 - color[node];
                    q.add(neighbour);
                }
                // same color on both sides → not bipartite
                else if (color[neighbour] == color[node]) {
                    return false;
                }
            }
        }
        return true;
    }
}