class Solution
{
        
    long power(int N,int R)
    {
        //Your code here
        long num = 1;
        int mod = (int)Math.pow(10, 9)+7;
        long X = N;
        
        while(R>0){
            if(R%2!=0){
                num = (num*X)%mod;
            }
            X = (X*X)%mod;
            R/=2;
        }
        return num;
    }

}
