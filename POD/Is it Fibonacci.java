class Solution {
    static long solve(int N, int K, ArrayList<Long> GeekNum) {
        //code here
        long sum=0;
        
        for(long i:GeekNum){
            sum+=i;
        }
        
        for(int i=K;i<N;i++){
            GeekNum.add(sum);
            sum = sum+GeekNum.get(i)-GeekNum.get(i-K);
        }
        return GeekNum.get(N-1);
    }
}
