class Solution {
    int[] row_r ={-1,1,0,0};
    int[] cow_r ={0,0,1,-1};

    class Pair{
        int row;
        int col;
        Pair(int row, int col){
            this.row = row;
            this.col = col;
        }
    }
    private boolean invalid(int i, int j , int n, int m){
        return i>=0 && i <n && j >=0 && j <m;
    }
    public void solve(char[][] board) {
        int rows = board.length;
        int cols = board[0].length;
        Queue<Pair> q = new LinkedList<>();
        boolean[][] visited = new boolean[rows][cols];
        for(int i = 0; i < cols; i++){
            if(board[0][i] == 'O' && !visited[0][i]){
                q.offer(new Pair(0,i));
                visited[0][i] = true;
            }
             if(board[rows-1][i] == 'O' && !visited[rows-1][i]){
                q.offer(new Pair(rows-1,i));
                visited[rows-1][i] = true;
            }
        }
        for(int i = 0; i < rows; i++){
            if(board[i][0] == 'O' && !visited[i][0]){
                q.offer(new Pair(i,0));
                visited[i][0] = true;
            }
            if(board[i][cols-1] == 'O' && !visited[i][cols-1]){
                q.offer(new Pair(i,cols-1));
                visited[i][cols-1] = true;
            }            
        }
        while(!q.isEmpty()){
           Pair front = q.poll();
            int i = front.row;
            int j = front.col;
            for(int k = 0 ;k < 4; k++){
                int new_i = i + row_r[k];
                int new_j = j + cow_r[k];
                if(invalid(new_i, new_j, rows, cols)&& board[new_i][new_j] =='O'&& !visited[new_i][new_j] ){
                    visited[new_i][new_j]= true;
                    q.offer(new Pair(new_i, new_j));
                }
            }
        }
        for(int i = 0 ; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(board[i][j] == 'O' && !visited[i][j]){
                    board[i][j] = 'X';
                }
            }
        }
    }
}