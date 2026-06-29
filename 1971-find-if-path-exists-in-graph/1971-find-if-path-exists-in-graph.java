class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        int size = edges.length;
        if(size == 0) return true;
        boolean[] visited = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        HashMap<Integer, List<Integer>> graph = new HashMap<>();
        for(int[] e:edges){
            graph.computeIfAbsent(e[0], k-> new ArrayList<>()).add(e[1]);
            graph.computeIfAbsent(e[1], k-> new ArrayList<>()).add(e[0]);
        }
        // for(int i = source; i < destination; i++ ){
            q.offer(source);
            visited[source] = true;
            while(!q.isEmpty()){
                int index = q.poll();
                // System.out.println("index: "+ index);
                // if(visited[index] == true) continue;
                List<Integer> value = graph.get(index);
                if(value == null) return false;
                for(int d: value){
                //    System.out.println("d: "+ d);
                    if(visited[d] == false){
                        q.offer(d);
                        visited[d] = true;
                    }
                }
            }
        // }
        return visited[destination];
    }
}