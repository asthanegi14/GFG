class Intersect
{
    //Function to find intersection point in Y shaped Linked Lists.
	int intersectPoint(Node head1, Node head2)
	{
         // code here
         Node a = head1;
         Node b = head2;
         
         while(a!=b){
            if(a==null){
                a = head2;
            }
            else if(a!=null){
                a=a.next;
            }
            if(b==null){
                b = head1;
            }
            else{
                b=b.next;
            }
         }
         return a.data;
	}
}
