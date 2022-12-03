class Solution {
    public static boolean canPlace(int[] s , int n, int k, int mid){
        int count=1,pos=s[0];
        
        for(int i=1;i<n;i++){
            if(s[i]-pos>=mid){
                count++;
                pos=s[i];
            }
            if(count==k){
                return true;
            }
        }
        return false;
    }
    public static int solve(int n, int k, int[] s) {
        Arrays.sort(s);
        int sol = 0;
        int min=Integer.MAX_VALUE, max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            min = Math.min(min,s[i]);
            max = Math.max(max,s[i]);
        }
        
        int l = 0, h = max-min;
        int mid=0;
        
        while(l<=h){
            mid = l+(h-l)/2;
            if(canPlace(s,n,k,mid)){
                sol = mid;
                l = mid+1;
            }
            else{
                h = mid-1;
            }
        }
        return sol;
    }
}
