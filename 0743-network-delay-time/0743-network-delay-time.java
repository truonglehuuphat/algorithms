class Solution {
    class Pair {
        int node;
        int dist;
        Pair(int n, int d){
            node = n;
            dist = d;
        }
    }
    public int networkDelayTime(int[][] times, int n, int k) {
        List<List<int[]>> graph = new ArrayList<>();
        for(int i = 0 ; i <= n; i++){
            graph.add(new ArrayList<>());
        }
        int[] dist = new int[n+1];
        for(int[] d: times ){
            int u = d[0];
            int v = d[1];
            int w = d[2];
            graph.get(u).add(new int[]{v, w});
            // graph.add(v).add(new int[]{u, w});
        }
        PriorityQueue<int[]> q = new PriorityQueue<>((a,b) -> a[0] - b[0]);
        Arrays.fill(dist, (int)1e9);

        dist[k] = 0;
        q.offer(new int[]{0, k});
        while(!q.isEmpty()){
            int[] curr = q.poll();
            int dis = curr[0];
            int node = curr[1];
            if(dis > dist[node]) continue;
            for(int[] p : graph.get(node)){
                int adjNode = p[0];
                int wt = p[1];
                if( dis + wt < dist[adjNode]){
                    dist[adjNode] = dis + wt;
                    q.offer(new int[]{dist[adjNode], adjNode});
                }
            }
        }
        int ans = 0;
        for(int i = 1; i <= n ; i++){
            if(dist[i] == (1e9)) return -1;
            ans = Math.max(ans,dist[i]);
        }
        return ans;
    }
}