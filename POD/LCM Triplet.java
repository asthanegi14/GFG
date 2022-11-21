class Solution {
    long lcmTriplets(long N) {
        // code here
        if(N<=2){
            return N;
        }
        if(N%2==0){
            if(N%3==0){
                return (N-1)*(N-2)*(N-3);
            }
        }
        if(N%2==0){
            return (N-1)*(N-3)*N;
        }
        return N*(N-1)*(N-2);
    }
}
