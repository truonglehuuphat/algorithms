class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        int size = edges.length;
        if(size == 0) return true;

        HashMap<Integer, List<Integer>> graph = new HashMap<>();
        for(int[] e:edges){
            graph.computeIfAbsent(e[0], k-> new ArrayList<>()).add(e[1]);
            graph.computeIfAbsent(e[1], k-> new ArrayList<>()).add(e[0]);
        }
        boolean[] visited = new boolean[n];
        Queue<Integer> q = new LinkedList<>();        
        q.offer(source);
        visited[source] = true;
        while(!q.isEmpty()){
            int index = q.poll();
            List<Integer> value = graph.get(index);
            if(index == destination) return true;
            for(int d: value){
                if(visited[d] == false){
                    q.offer(d);
                    visited[d] = true;
                }
            }
        }
        return false;
    }
}