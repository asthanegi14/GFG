class Solution {
    long wineSelling(int arr[],int n){
        // code here
        int buy = 0, sell = 0;
        long ans = 0;
        while(buy!=n && sell!=n){
            while(arr[buy]<=0){
                buy++;
                if(buy==n){
                    return ans;
                }
            }
            while(arr[sell]>=0){
                sell++;
                if(sell==n){
                    return ans;
                }
            }
            
            if(Math.abs(arr[buy])>Math.abs(arr[sell])){
                ans += Math.abs(arr[sell])*Math.abs(buy-sell);
                arr[buy] += arr[sell];
                arr[sell] = 0;
            }
            else{
                ans += Math.abs(arr[buy])*Math.abs(buy-sell);
                arr[sell] += arr[buy];
                arr[buy] = 0;
            }
        }
        return ans;
    }
}
