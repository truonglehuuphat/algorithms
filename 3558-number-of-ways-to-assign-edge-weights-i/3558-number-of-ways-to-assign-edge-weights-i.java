class Solution {
    private static final int MOD = 1_000_000_007;
    private int qpow(int x, int y){
        long res = 1;
        long base = x;
        while(y > 0){
            if((y&1) == 1){
                res = (res * base) % MOD;
            } 
            base = (base * base) % MOD;
            y >>= 1;
        }
        return (int) res;
    }

    private int dfs(List<List<Integer>> graph, int x, int f){
        int maxDepth = 0;
        for(int y: graph.get(x)){
            if(y == f) continue;
            maxDepth = Math.max(maxDepth, dfs(graph, y, x) + 1);
        }
        return maxDepth;
    }
    public int assignEdgeWeights(int[][] edges) {
        int n = edges.length + 1;
        List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0 ; i <= n; i++){
            graph.add(new ArrayList<>());
        }
        for(int[] d: edges){
            int u = d[0];
            int v = d[1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        int maxDepth = dfs(graph, 1, 0);
        return qpow(2, maxDepth - 1);
    }
}