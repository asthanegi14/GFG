class Solution
{
    //Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer>s,int size){
        // code here
        int mid = (size+1)/2;
        s.remove(mid-1);
    } 
}
