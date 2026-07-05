class Solution {
    int[] row_b = {-1, 1, 0, 0};
    int[] col_b = { 0, 0, -1, 1};
    private boolean isValid(int i, int n, int j, int m){
        return i >=0 && i < n && j >=0 && j < m;
    }
    class Pair{
        int row;
        int col;
        Pair(int r, int c){
            row = r;
            col = c;
        }
    }
    public int numIslands(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int numberIsland = 0;
        boolean[][] visited = new boolean[rows][cols];
        Queue<Pair> q = new LinkedList<>();
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(grid[i][j] == '1' && visited[i][j] == false){
                    numberIsland++;
                    q.offer(new Pair(i, j));
                    visited[i][j] = true;

                    while(!q.isEmpty()){
                        Pair node = q.poll();
                        int m = node.row;
                        int n = node.col;
                        // if(grid[m][n] != '1'){
                        //     continue;
                        // }
                        for(int k = 0 ; k < 4; k++){
                            int nb_i = m + row_b[k];
                            int nb_j = n + col_b[k];
                            if(isValid(nb_i, rows, nb_j, cols) && grid[nb_i][nb_j] == '1' && visited[nb_i][nb_j] == false){
                                q.offer(new Pair(nb_i, nb_j));
                                visited[nb_i][nb_j] = true;
                            }
                        }
                    }
                }
            }
        }
        return numberIsland;
    }
}