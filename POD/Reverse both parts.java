class Solution {
    public static Node revHalf(Node temp){
        Node prev = null;
        Node curr = temp;
        Node nxt = curr.next;
        
        while(curr!=null){
            curr.next = prev;
            prev = curr;
            curr = nxt;
            
            if(nxt!=null){
                nxt = nxt.next;
            }
        }
        return prev;
    }
    public static Node reverse(Node head, int k) {
        // code here
        Node temp = head;
        while(k-->1){
            temp = temp.next;
        }
        
        Node rem = temp.next;
        temp.next = null;
        
        revHalf(head);
        
        Node a = revHalf(rem);
        
        head.next = a;
        return temp;
    }
}
