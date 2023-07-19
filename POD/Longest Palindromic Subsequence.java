class Solution
{
    public int longestPalinSubseq(String S)
    {
        //code here
        int n = S.length(); 
        int[][] dp = new int[n][n];
        
        for(int i=n-1;i>=0;i--){
            dp[i][i] = 1;
            for(int j=i+1;j<n;j++){
                if(S.charAt(i) == S.charAt(j)){
                    dp[i][j] = 2+dp[i+1][j-1];
                }
                else{
                    dp[i][j] = Math.max(dp[i+1][j], dp[i][j-1]);
                }
            }
        }
        
        return dp[0][n-1];
    }
}
