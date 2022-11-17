class Solution {

    long countSubarray(int arr[], int n, int k) {
        // code here
        long ans=(long)n*(n+1)/2;
        long count=0;
        // for(int i=0;i<n;i++){
        //     if(arr[i]>k){
        //         ans += n-i;
        //     }
        //     else{
        //         for(int j=i;j<n;j++){
        //             if(arr[j]>k){
        //                 ans += n-j;
        //                 break;
        //             }
        //         }
        //     }
        // }
        
        for(int i=0;i<n;i++){
            if(arr[i]<=k){
                count++;
            }
            else{
                ans-=count*(count+1)/2;
                count=0;
            }
        }
        ans-=count*(count+1)/2;
        return ans;
    }
}
