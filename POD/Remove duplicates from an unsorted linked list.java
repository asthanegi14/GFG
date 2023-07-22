class Solution
{
    //Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) 
    {
         // Your code here
         HashSet<Integer> set = new HashSet<>();
         Node temp = head;
         Node pre = null;
         
         while(temp!=null){
             int val = temp.data;
            if(set.contains(val)){
               pre.next = temp.next; 
            }
            else{
                set.add(val);
                pre = temp;
            }
            temp = temp.next;
         }
         return head;
    }
}
