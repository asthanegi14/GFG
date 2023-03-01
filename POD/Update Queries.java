class Solution{
	int[] updateQuery(int N, int Q, int[][] U){
        //Write your code here
        int[] ans = new int[N];
        
        for(int i=0;i<Q;i++){
            int l = U[i][0];
            int r = U[i][1];
            int x = U[i][2];
            
            for(int j=l-1;j<r;j++){
                ans[j] |= x;
            }
        }
        return ans;
    }
}
