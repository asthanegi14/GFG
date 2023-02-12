class Solution
{
    int PrimeCheck(int data){
        int p1=0,p2=0;
        
        if(data == 1){
            return 2;
        }
        
        for(int i=data;i>1;i--){
            if(isPrime(i)){
                p1=i;
                break;
            }
        }
        
        for(int i=data;i<data*data;i++){
            if(isPrime(i)){
                p2=i;
                break;
            }
        }
        if(Math.abs(p1-data) != Math.abs(p2-data)){
            return Math.abs(p1-data) < Math.abs(p2-data) ? p1:p2; 
        }
        else{
            return p1>p2 ? p2:p1;
        }
    }
    
    boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    Node primeList(Node head){
        //code here
        
        if(head == null){
            return head; 
        }
        
        Node temp = head;
        
        while(temp!=null){
            if(!isPrime(temp.val)){
                int newVal = PrimeCheck(temp.val);
                temp.val = newVal;
            }
            temp = temp.next;
        }
        return head;
    }
}
