class Solution
{
    public int LongestRepeatingSubsequence(String str)
    {
        // code here
        int ans=0;
        int[][] arr = new int[str.length()+1][str.length()+1];
        
        for(int i=1;i<=str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                if(str.charAt(i-1)==str.charAt(j-1)){
                    arr[i][j] = 1+arr[i-1][j-1];
                }
                else{
                    arr[i][j] = Math.max(arr[i-1][j], arr[i][j-1]);
                }
                ans = Math.max(ans, arr[i][j]);
            }
        }
        return ans;
    }
}
