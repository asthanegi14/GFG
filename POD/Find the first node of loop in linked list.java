class Solution {
    //Function to find first node if the linked list has a loop.
    public static int findFirstNode(Node head){
        //code here
        Node f=head;
        Node s=head;
        
        while(s!=null && s.next!=null){
            f=f.next;
            s=s.next.next;
            if(f==s){
                f=head;
                while(f!=s){
                    s=s.next;
                    f=f.next;
                }return f.data;
            }
        }
        return -1;
    }
}
