class Solution {
    int r, c;

    //create an valid function
    private boolean valid(int i, int j) {
        return i >= 0 && i < r && j >= 0 && j < c;
    }

    public int numIslands(char[][] grid) {

        r = grid.length;
        c = grid[0].length;
        // Queue<int[]> q = new LinkedList<>();//for bfs
        int island = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (grid[i][j] == '1') {
                    // island++;
                    // bfsCall(grid, i, j);
                    //dfs call
                    dfsCall(grid, i, j);
                    island++;
                }

            }
        }
        return island;
    }

    private void bfsCall(char[][] grid, int startrow, int startcol) {
        Queue<int[]> q = new LinkedList<>();
        // make all one convert to zero
        q.add(new int[] { startrow, startcol });
        grid[startrow][startcol] = '0';

        // bfs call
        while (q.size() > 0) {
            int pair[] = q.poll();
            int new_i = pair[0];
            int new_j = pair[1];
            // and make all adjacent 1 by 0
            //4 in the leetcode only four direction
            // direction{up,down,left,right)
            // directions: up, down, left, right
            int row[] = { -1, 1, 0, 0 };
            int col[] = { 0, 0, -1, 1 };
            //check all 8 neighbours 
            for (int k = 0; k < 4; k++) {
                int newrow = new_i + row[k];
                int newcol = new_j + col[k];

                //  If neighbor is valid and is land ('L'), visit it
                if (valid(newrow, newcol) && grid[newrow][newcol] == '1') {
                    grid[newrow][newcol] = '0';
                    q.add(new int[] { newrow, newcol });
                }
            }

        }

    }

    //by using the dfs 
    private void dfsCall(char[][] grid, int i, int j) {
        //check validation
        if (!valid(i,j)) {
            return;
        }
        //check visited or not 
        if (grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';

        //now start dfs call for all direction
        int row[] = { -1, 1, 0, 0 };
        int col[] = { 0, 0, -1, 1 };

        for (int k = 0; k < 4; k++) {
            int newrow = i + row[k];
            int newcol = j + col[k];

            dfsCall(grid, newrow, newcol);
        }
    }
}