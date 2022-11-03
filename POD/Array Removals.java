class Solution {
    int removals(int[] arr, int n, int k) {
        // code here
        Arrays.sort(arr);
        int max=0,i=0,j=0;
        while(j<n){
            if((arr[j]-arr[i])<=k){
                j++;
            }
            else if(i<j){
                i++;
            }
            max=Math.max(max,j-i);
        }
        return n-max;
    }
}
