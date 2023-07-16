class GfG{
    //Function to reverse the queue.
    public Queue<Integer> rev(Queue<Integer> q){
        //add code here.
        Stack<Integer> s = new Stack<>();
        while(!q.isEmpty()){
            s.push(q.poll());
        }
        
        while(!s.isEmpty()){
            q.add(s.pop());
        }
        return q;
    }
}
