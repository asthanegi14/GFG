class Solution {
    static boolean isPrime(int i){
        for(int k=2;k*k<=i;k++){
            if(i%k==0){
                return false;
            }
        }
        return true;
    }
    static String isSumOfTwo(int N){
        // code here
        for(int i=2;i<N;i++){
            if(isPrime(i) && isPrime(N-i)){
                return "Yes";
            }
        }
        return "No";
    }
}
