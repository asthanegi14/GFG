
//User function Template for Java

class Solution {
    static int longestPerfectPiece(int[] arr, int N) {
        // code here
        int i=0,j=0,ans=0;
        while(i<N){
            if(Math.abs(arr[i]-arr[j])<=1){
                ans = Math.max(ans,i-j+1);
                i++;
            }
            else if(Math.abs(arr[i]-arr[j])>1){
                j++;
            }
        }
        return ans;
    }
};
