class Solution {

    int maxIndexDiff(int arr[], int n) {
        // code here
        int ans=0;
        
        int[] a = new int[n];
        int[] b = new int[n];
        
        a[0] = arr[0];
        for(int i=1;i<n;i++){
            a[i] = Math.min(a[i-1], arr[i]);
        }
        
        b[n-1]=arr[n-1];
        for(int j=n-2;j>=0;j--){
            b[j] = Math.max(b[j+1], arr[j]);
        }
        
        int i=0, j=0;
        ans=0;
        
        while(i<n && j<n){
            if(a[i]<=b[j]){
                int dif = j-i;
                ans = Math.max(ans, dif);
                j++;
            }
            else{
                i++;
            }
        }
        return ans;
    }
}
