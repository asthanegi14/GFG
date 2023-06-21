class Solution {
    static int sumOfNaturals(int n) {
        // code here
        int mod = (int)Math.pow(10,9)+7;
        // int sum=0;
        // for(int i=1;i<=n;i++){
        //     sum=sum+i;
        //     if(sum>mod){
        //         sum%=mod;
        //     }
        // }
        // return sum;
        
        return (int)(((n%mod)*1l*((n+1)%mod)/2)%mod);
    }
};
