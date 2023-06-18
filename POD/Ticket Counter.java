class Solution {
    public static int distributeTicket(int N,int k)
    {
        Deque<Integer> dq = new ArrayDeque<>();
        for(int i=0;i<N;i++){
            dq.add(i+1);
        }
        int ans=0;
        
        while(dq.size()!=0){
            for(int i=0;i<k;i++){
                if(!dq.isEmpty()){
                    ans = dq.removeFirst();
                    // System.out.println("ans="+ans);
                }
            }
            for(int i=0;i<k;i++){
                if(!dq.isEmpty()){
                    ans = dq.pollLast();
                    // System.out.println("ans="+ans);
                }
            }
        }
        return ans;
    }
}
