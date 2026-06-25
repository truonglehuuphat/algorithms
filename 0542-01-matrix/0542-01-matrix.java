class Solution {
    int[] row_b = {-1, 1 ,0 ,0};
    int[] col_b = {0, 0 , -1, 1};
    private boolean valid(int i , int j, int n, int m){
        return i >=0 && i < n && j >= 0 && j < m;
    }
    class Pair{
        int row;
        int col;
        Pair(int i, int j){
            row = i;
            col = j;
        }
    }

    public int[][] updateMatrix(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        // boolean[][] visited = new boolean[rows][cols];
        Queue<Pair> q = new ArrayDeque<>();
        for(int i = 0 ; i < rows; i++){
            for(int j = 0 ; j < cols; j++){
                if(mat[i][j] == 0){
                    q.offer(new Pair(i,j));
                } else {
                    mat[i][j] = -1;
                }
            }
        }

        while(!q.isEmpty()){
            Pair front = q.poll();
            int i = front.row;
            int j = front.col;
            for(int k = 0; k < 4; k++){
                int new_i = i + row_b[k];
                int new_j = j + col_b[k];
                if(!valid(new_i, new_j, rows, cols) || mat[new_i][new_j] != -1) continue;
                mat[new_i][new_j] = 1 + mat[i][j];
                q.offer(new Pair(new_i, new_j));
                // visited[new_i][new_j] = true;
            }
        }
        return mat;
    }
}