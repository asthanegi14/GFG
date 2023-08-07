class Solution
{
    static boolean isSafe(int r, int c, int num, int[][] grid){
        int n = grid.length;
        for(int i=0;i<n;i++){
            if(grid[r][i]==num){
                return false;
            }
            if(grid[i][c]==num){
                return false;
            }
        }
        int a = (r/3)*3, b = (c/3)*3;
        for(int i=a;i<a+3;i++){
            for(int j=b;j<b+3;j++){
                if(grid[i][j]==num){
                    return false;
                }
            }
        }
        return true;
    }
    static boolean find(int r, int c, int[][] grid){
        int n=grid.length;
        if(r==n){
            return true;
        }
        int nr=0, nc=0;
        if(c!=n-1){
            nr = r;
            nc = c+1;
        }
        else{
            nr = r+1;
            nc = 0;
        }
        if(grid[r][c]==0){
            for(int i=1;i<=9;i++){
                if(isSafe(r, c, i, grid)){
                    grid[r][c]=i;
                    if(find(nr, nc, grid)){
                        return true;
                    }
                    grid[r][c]=0;
                }
            }
        }
        else{
            if(find(nr, nc, grid)){
                return true;
            }
        }
        return false;
    }
    //Function to find a solved Sudoku. 
    static boolean SolveSudoku(int grid[][])
    {
        // add your code here
        int n=grid.length, m=grid[0].length;
        return find(0, 0, grid);
    }
    
    //Function to print grids of the Sudoku.
    static void printGrid (int grid[][])
    {
        // add your code here
        int n = grid.length, m = grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(grid[i][j]+" ");
            }
        }
    }
}
