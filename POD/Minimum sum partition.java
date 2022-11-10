class Solution
{

	public int minDifference(int arr[], int n) 
	{ 
	    // Your code goes here
	    int sum=0;
	    for(int i:arr){
	        sum+=i;
	    }
	    
	    boolean[][] dp = new boolean[n+1][sum+1];
	    
	    
	    for(int i=0;i<=n;i++){
	        for(int j=0;j<=sum;j++){
	            if(i==0){
	                dp[i][j]=false;
	            }
	            if(j==0){
	                dp[i][j]=true;
	            }
	        }
	    }
	    
	    for(int i=1;i<=n;i++){
	        for(int j=1;j<=sum;j++){
	            if(arr[i-1]<=j){
	                dp[i][j]=dp[i-1][j-arr[i-1]] || dp[i-1][j];
	            }
	            else{
	                dp[i][j]=dp[i-1][j];
	            }
	        }
	    }
	    
	    ArrayList<Integer> ans = new ArrayList<>();
	    
	    for(int i=0;i<(sum/2)+1;i++){
	        if(dp[n][i]){
	            ans.add(i);
	        }
	    }
	    int ret=Integer.MAX_VALUE;
	    
	    for(Integer i:ans){
	        ret = Math.min(ret,sum-(2*i));
	    }
	    return ret;
	} 
}
