class Solution {
    static int maxGroupSize(int[] arr, int N, int K) {
        // code here
        // for(int i=0;i<N;i++){
        //     for(int j=i;j<N;j++){
        //         int sum=0;
        //         for(int k=i;k<=j;k++){
        //             sum+=arr[k];
        //             if(sum/K!=0){
        //                 maxSize=k;
        //             }
        //         }
        //         // System.out.println(sum);
        //     }
        // }
        
        int[] a = new int[K];
        for(int i=0;i<N;i++){
            a[arr[i]%K]++;
        }
        if(a[0]>0){
            a[0]=1;
        }
        if(K%2==0 && a[K/2]>=2){
            a[K/2]=1;
        }
        int maxSize=a[0];
        
        for(int i=1;i<=K/2;i++){
            maxSize+=Math.max(a[i],a[K-i]);
        }
        return maxSize;
    }
};
