class Solution{
    
    static boolean isValid(int n){
        if(n>9){
            int ans=0;
            while(n!=0){
                int i = n%10;
                ans = ans + (i*i);
                n/=10;
            }
            return isValid(ans);
        }
        
        if(n==7 || n==1){
            return true;
        }
        return false;
    }
    static int nextHappy(int N){
        // code here
        while(true){
            N++;
            if(isValid(N)){
                return N;
            }
        }
    }
}
