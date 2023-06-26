class Solution{
    static int nCr(int n, int r)
    {
        // code here
        int mod = (int)Math.pow(10,9)+7;
        if(r>n){
            return 0;
        }
        
        int[][] a = new int[n+1][r+1];
        
        for(int i=0;i<=n;i++){
            a[i][0]=1;
        }
        
        for(int i=0;i<=n;i++){
            for(int j=1;j<=Math.min(i, r);j++){
                a[i][j] = (a[i-1][j-1]%mod + a[i-1][j]%mod)%mod;
            }
        }
        return a[n][r];
    }
}
