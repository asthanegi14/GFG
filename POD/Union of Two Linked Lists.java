class Sol
{
	public static Node findUnion(Node head1,Node head2)
	{
	    //Add your code here.
	    HashSet<Integer> arr = new HashSet<>();
	    
	    while(head1!=null){
	        arr.add(head1.data);
	        head1 = head1.next;
	    }
	    while(head2!=null){
	        arr.add(head2.data);
	        head2 = head2.next;
	    }
	    
	    Node n = new Node(-1);
	    Node n2 = n;
	    
	    for(int i:arr){
	        n2.next = new Node(i);
	        n2 = n2.next;
	    }
	    
	    return n.next;
	}
}
