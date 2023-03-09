
class Solution {
    public static Node insertList(Node a, Node b){
        Node list1 = new Node(' ');
        Node list2 = list1;
        
        Node temp = a;
        while(temp!=b){
            char curr = temp.data;
            list1.next = new Node(curr);
            list1 = list1.next;
            
            temp = temp.next;
        }
        return list2.next;
    }
    public static ArrayList<Node> findAnagrams(Node head, String s) {
        // code here
        ArrayList<Node> ans = new ArrayList<>();
        HashMap<Character,Integer> c = new HashMap<>();
        
        
        for(int i=0;i<s.length();i++){
            c.put(s.charAt(i), c.getOrDefault(s.charAt(i),0)+1);
        }
        
        Node a=head,b=head;
        int i=0, j=1, k=0;
        HashMap<Character,Integer> c2 = new HashMap<>();
            
        while(b!=null && i<s.length()){
            c2.put(b.data, c2.getOrDefault(b.data,0)+1);
            b = b.next;
            i++;
            j++;
        }
            
        if(c.equals(c2) && ((j-k)>=s.length())){
            k=j;
            Node nxt = insertList(a,b);
            ans.add(nxt);
        }
        
        while(b!=null){
            char ch1 = a.data;
            char ch2 = b.data;
            
            c2.put(ch2, c2.getOrDefault(ch2,0)+1);
            
            if(c2.get(ch1)==1){
                c2.remove(ch1);
            }
            else{
                c2.put(ch1, c2.get(ch1)-1);
            }
            a=a.next;
            b=b.next;
            j++;
            
            if(c.equals(c2) && ((j-k)>=s.length())){
                k=j;
                
                Node l = insertList(a,b);
                ans.add(l);
            }
        }
        return ans;
    }
}
