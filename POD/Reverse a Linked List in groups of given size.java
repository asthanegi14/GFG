class Solution
{
    public static Node reverseIt(Node node, int k){
        Node temp = node;
        Node pre = null;
        Node nxt = null;
        int c=0;
        
        while(temp!=null && c<k){
            nxt = temp.next;
            temp.next = pre;
            pre = temp;
            temp = nxt;
            temp = nxt;
            c++;
        }
        
        if(nxt!=null){
            node.next = reverse(nxt, k);
        }
        return pre;
    }
    
    public static Node reverse(Node node, int k)
    {
        //Your code here
        return reverseIt(node, k);
    }
}
