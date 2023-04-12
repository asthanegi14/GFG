class Solution {
    public static int find(int[] a, int i, int j, int num){
        int count=j+1;
        while(i<=j){
            int mid = (i+j)/2;
            
            if(a[mid]>=num*5){
                count=mid;
                j=mid-1;
            }
            else{
                i=mid+1;
            }
        }
        return count;
    }
    public static int dominantPairs(int n, int[] arr) {
        // code here
        int i=0, count=0;
        
        Arrays.sort(arr, 0, n/2);
        
        
        for(int j=n/2;j<n;j++){
            int ret = find(arr, 0, n/2-1, arr[j]);
            count+=(n/2-ret);
        }
        
        return count;
    }
}
