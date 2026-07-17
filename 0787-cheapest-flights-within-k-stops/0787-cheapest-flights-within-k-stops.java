class Solution {
    class Pair{
        long dist;
        int node;
        int stopstation;
        Pair(int s, long d, int n){
            dist = d;
            stopstation = s;
            node = n;
        }
    }
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        List<List<int[]>> graph = new ArrayList<>();
        for(int i = 0;i <= n ; i++){
            graph.add(new ArrayList<>());
        }
        for(int[] d: flights){
            int u = d[0];
            int v = d[1];
            int w = d[2];
            graph.get(u).add(new int[]{v,w});
        }
        long[] dist = new long[n+1];
        Arrays.fill(dist,Integer.MAX_VALUE); 

        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> a.stopstation - b.stopstation);
        dist[src] = 0;
        pq.offer(new Pair(0,0,src));
        while(!pq.isEmpty()){
            Pair node = pq.poll();
            int stopstation = node.stopstation;
            long d = (long )node.dist;
            int des = node.node;
            if(k < stopstation ) continue;
            for(int[] p: graph.get(des)){
                int  node_negb = p[0];
                long w = (long)p[1];
                // System.out.println("stopstation :" + stopstation + " dist[" + node_negb + "] " +  dist[node_negb]);
                System.out.println(node_negb + " " + w);
                if(d + w < dist[node_negb] && stopstation <= k){
                    dist[node_negb] = (d + w);
                    // System.out.println(dist[node_negb]);
                    pq.offer(new Pair(stopstation + 1, (long)dist[node_negb],node_negb));
                }
            }
        }
        System.out.println(dist[dst]);
        return dist[dst] != Integer.MAX_VALUE ? (int) dist[dst] : -1;
    }
}