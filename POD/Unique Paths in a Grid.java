class Solution {
    static int uniquePaths(int n, int m, int[][] grid) {
        // code here
        if(grid[0][0]==0 || grid[n-1][m-1]==0){
            return 0;
        }
        long[][] dp = new long[n][m];
        int mod = (int)Math.pow(10,9)+7;
        
        dp[0][0]=1;
        for(int i=1;i<m;i++){
            if(grid[0][i]==0){
                dp[0][i]=0;
            }
            else{
                dp[0][i]=dp[0][i-1];
            }
        }
        for(int i=1;i<n;i++){
            if(grid[i][0]==0){
                dp[i][0]=0;
            }
            else{
                dp[i][0]=dp[i-1][0];
            }
        }
        
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(grid[i][j]==0){
                    dp[i][j]=0;
                }
                else{
                    dp[i][j] = (dp[i-1][j]%mod + dp[i][j-1]%mod)%mod;
                }
            }
        }
        return (int)(dp[n-1][m-1]%mod);
    }
};
