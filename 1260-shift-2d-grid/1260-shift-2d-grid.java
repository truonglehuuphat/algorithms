class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        System.out.println(n);
        List<List<Integer>> map = new ArrayList<>();
        int[][] ans = new int[m][n];
        
        for(int i = 0 ; i < m; i++){
            for(int j = 0 ; j < n; j++){
                int nextj = j+k;
                int nexti = i;
                if(nextj >= n) {
                    nexti = nexti + nextj / n;
                    nextj = nextj % n;
                }

                // if(nexti == m -1 && nextj == n -1){
                //      System.out.print("[" + nexti + "]" + "[" + nextj + "]: " + i + " "+ j + "    ");
                //     ans[0][0] = grid[i][j];
                // } else {
                    if( nexti >= m){
                        nexti = nexti % m;
                    }
                    // System.out.print("[" + nexti + "]" + "[" + nextj + "]: " + i + " "+ j + "    ");
                    ans[nexti][nextj] = grid[i][j];
                // }
            }
            //  System.out.println("");
        }

        for(int i = 0; i < m ; i++){
            map.add(new ArrayList<>());
            for(int j = 0; j < n; j++){
                map.get(i).add(ans[i][j]);
            }
        }

        return map;
    }
}