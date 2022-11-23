class Solution {
    static long maxSumLCM(int n) {
        // code here
        long sum=0;
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                sum=sum+(n/i);
                if(n/i!=i){
                    sum+=i;
                }
            }
        }
        return sum;
    }
}
