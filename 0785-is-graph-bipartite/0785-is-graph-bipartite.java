class Solution {
    public boolean isBipartite(int[][] graph) {
        int node = graph.length;
        int[] visited = new int[node];     
        for(int i = 0 ; i < node; i++){
            if(visited[i] !=0  ) continue;
            Queue<Integer> q = new LinkedList<>();
            q.offer(i);
            visited[i] = 1;
            while(!q.isEmpty()){
                int cur = q.poll();                
                for(int next: graph[cur]){
                    if(visited[next] == 0){
                        q.offer(next);
                        visited[next] = -visited[cur];
                    } else if(visited[next] != -visited[cur]){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}