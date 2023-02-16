class Solution {
    public static boolean solve(int n, int[] nums, int i, int[] val){
       if(i<0 || i>=n || val[i]==2){
           return true;
       }
       if(val[i]==1){
           return false;
       }
       
       val[i]=1;
       boolean b = solve(n,nums,i+nums[i],val);
       
       if(b){
           val[i]=2;
       }
       return b;
    }
    public static int goodStones(int n, int[] arr) {
        // code here
        int ans=0;
        int[] val = new int[n];
        for(int i=0;i<n;i++){
            if(val[i]==0){
                solve(n,arr,i,val);
            }
            if(val[i]==2){
                ans++;
            }
        }
        return ans;
    }
}
