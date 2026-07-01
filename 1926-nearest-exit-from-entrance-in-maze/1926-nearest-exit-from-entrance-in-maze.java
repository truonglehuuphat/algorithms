class Solution {
    class Pair{
        int row;
        int col;
        Pair(int r, int c){
            row = r;
            col = c;
        }
        public boolean equals(Pair obj){
            return row == obj.row && col == obj.col;
        }   

    }
    int[] row_b = {-1, 1 ,0 ,0};
    int[] col_b = {0 ,0, -1, 1};

    private boolean isValid(int i, int n, int j,  int m){
        return i >= 0 && i < n && j >= 0 && j < m;
    }
    // private boolean isExit(int i, int j, List<Pair> ans){
    //     Pair node = new Pair(i, j);
    //     for(Pair p : ans){
    //         if(p.equals(node)){
    //             return true;
    //         } 
    //     }
    //     return false;
    // }
    private boolean isExit(int i, int j, int n, int m, int[] entrance){
        if(i== entrance[0] && j == entrance[1]){
            return false;
        }
        return (i == 0 || j == 0 || i == n - 1 || j == m - 1);
    }

    public int nearestExit(char[][] maze, int[] entrance) {
        int rows = maze.length;
        int cols = maze[0].length;
        boolean[][] visited = new boolean[rows][cols];
        Queue<Pair> q = new LinkedList<>();
        // List<Pair> ans = new ArrayList<>();
        // for(int i = 0; i < rows; i++){
        //     for(int j = 0 ; j < cols; j++){
        //         if(i == 0 || j == 0 || i == rows - 1 || j == cols - 1){
        //             if(maze[i][j] == '.'){
        //                 if(i != entrance[0]  || j != entrance[1]){
        //                     ans.add(new Pair(i,j));
        //                 }
        //             }
        //         }
        //     }
        // }
        q.offer(new Pair(entrance[0], entrance[1]));
        visited[entrance[0]][entrance[1]] = true;
        int step = 0;
        while(!q.isEmpty()){
            int size = q.size();
            for(int z = 0 ; z < size; z++){
                Pair cell = q.poll();
                int i = cell.row;
                int j = cell.col;
                if(isExit(i, j, rows, cols, entrance )) return step;
                for(int k = 0; k < 4; k++){
                    int new_row = i + row_b[k];
                    int new_col = j + col_b[k];
                    if(new_row == entrance[0]  && new_col == entrance[1]) continue;
                    if(isValid(new_row, rows, new_col, cols) && visited[new_row][new_col] == false){
                        if(maze[new_row][new_col] == '.'){
                            q.offer(new Pair(new_row, new_col));
                            visited[new_row][new_col] = true;
                        }
                    }
                }
            }
            step++;
        }
        return -1;
    }
}