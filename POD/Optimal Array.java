class Solution {
    public long[] optimalArray(int n,int a[])
    {
        long[] sum = new long[n];
        long[] ans = new long[n];
        long sum1=0;
        
        sum[0] = a[0];
        for(int i=1;i<n;i++){
            sum[i] = sum[i-1]+a[i]; 
        }
        
        for(int i=1;i<n;i++){
            if(i%2==0){
                int mid = i/2;
                sum1 = sum[i]-sum[mid]-sum[mid-1];
            }
            else{
                int mid = i/2;
                sum1 = sum[i] - 2*sum[mid];
            }
            
            ans[i] = sum1;
        }
        return ans;
    }
}
