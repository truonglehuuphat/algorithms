class Solution {
    // void dfs(int node, int[][] isConnected, boolean[] visit){
    //     visit[node] = true;
    //     for(int i = 0;i < isConnected.length; i++){
    //         if(isConnected[node][i] ==1 && !visit[i]){
    //             dfs(i,isConnected, visit);
    //         }
    //     }
    // }

    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        int numberOfProvinces = 0;
        boolean[] visited = new boolean[n];
        for(int i = 0; i < n; i++){
            if(visited[i]== true) continue;

            Queue<Integer> q = new LinkedList<>();
            q.offer(i);
            while(!q.isEmpty()){
                int node = q.poll();
                for(int j = 0 ; j < n ; j++){
                    if(visited[j]== false && isConnected[node][j] == 1){
                        q.offer(j);
                        visited[j] =  true;
                    }
                }
            }
            numberOfProvinces++;
        }
        return numberOfProvinces;
    }
}