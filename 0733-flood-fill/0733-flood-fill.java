class Solution {
    int[] row={-1, 1, 0, 0};
    int[] col = {0, 0, -1, 1};
    private boolean valid(int i, int j, int n, int m){
        return i >= 0 && i < n && j >= 0 && j <m;
    }    
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int rows = image.length;
        int cols = image[0].length;
        int orginal = image[sr][sc];
        if(orginal == color) return image;
        Queue<int[]> q = new LinkedList<>();
        image[sr][sc] = color;
        q.offer(new int[]{sr,sc});
        while(!q.isEmpty()){
            int[] front = q.poll();
            int i = front[0];
            int j = front[1];
            for(int k = 0 ; k < 4; k++){
                int new_i = i+ row[k];
                int new_j = j+ col[k];
                if(valid(new_i,new_j, rows, cols) && image[new_i][new_j] == orginal){
                    image[new_i][new_j] = color;
                    q.offer(new int[]{new_i,new_j});
                }
            }
        }
        return image;
    }
}