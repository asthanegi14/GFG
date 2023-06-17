class Geeks{
    
    // Function to insert element into the queue
    
    static void insert(Queue<Integer> q, int k){
        
        // Your code here
        q.add(k);
    }
    
    // Function to find frequency of an element
    // rteturn the frequency of k
    static int findFrequency(Queue<Integer> q, int k){
        
        // Your code here
        return Collections.frequency(q, k);
    }
    
}
