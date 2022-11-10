class Solution {
    static long jumpingNums(long X) {
        // code here
        Queue<Long> q = new LinkedList<>();
        
        for(long i=1;i<=9;i++){
            q.add(i);
        }
        
        long ans = 0;
        while(!q.isEmpty()){
            long p = q.remove();
            if(p>X){
                continue;
            }
            ans = Math.max(ans,p);
            long ut = p%10;
            if(ut!=0){
                long x = p*10+(ut-1);
                q.add(x);
            }
            if(ut!=9){
                long x = p*10+(ut+1);
                q.add(x);
            }
        }
        return ans;
    }
};
