class Solution
{
    public long NoOfChicks(int N)
    {
        // Code here
        long[] dp = new long[N];
        dp[0]=1;
        
        for(int i=1;i<N;i++){
            if(i<6){
                dp[i]=dp[i-1]*3;
            }
            else if(i==6){
                dp[i]=dp[i-1]*3-dp[0]*3;
            }
            else{
                dp[i]=dp[i-1]*3-dp[i-6]*2;
            }
        }
        return dp[N-1];
    }
}
