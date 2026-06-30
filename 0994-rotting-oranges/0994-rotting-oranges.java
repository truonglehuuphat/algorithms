class Solution {
    class Pair {
        int row;
        int col;
        Pair(int r, int c){
            row = r;
            col = c;
        }
    }
    int[] row_b = {-1, 1, 0, 0};
    int[] col_b = {0, 0, -1, 1};
    Queue<Pair> q = new LinkedList<>();
    private boolean isValid(int i , int n, int j, int m){
        return i >= 0 && i < n && j >= 0 && j < m;
    }
    
    public int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int freshOrange = 0;
        int minutes = 0;
        boolean[][] visited = new boolean[rows][cols];
        for(int i = 0 ; i  < rows ; i++){
            for(int j = 0 ; j < cols; j++){
                if(grid[i][j] == 2){
                   q.offer(new Pair(i,j));
                }
                else if(grid[i][j] == 1){
                    freshOrange++;
                } else {
                    visited[i][j] = true;
                }
            }
        }
        if(freshOrange == 0 ) return 0;
        if(q.size() == 0) return -1;
        while(!q.isEmpty()){
            int store = q.size();
            if(freshOrange == 0) return minutes;
            for(int z = 0; z < store; z++){
                Pair node = q.poll();
                int i = node.row;
                int j = node.col;
                for(int k = 0; k < 4; k++){
                    int new_row = i + row_b[k];
                    int new_col = j + col_b[k];
                    if(isValid(new_row, rows, new_col, cols) && visited[new_row][new_col] == false){
                        if(grid[new_row][new_col] == 1){
                            grid[new_row][new_col] = 2;
                            freshOrange--;
                            visited[new_row][new_col] = true;
                            q.offer(new Pair(new_row, new_col));
                        }
                    }
                }
            }
            minutes++;
        }
        return -1;
    }
}