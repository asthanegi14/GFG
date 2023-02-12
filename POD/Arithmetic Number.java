class Solution{
    static int inSequence(int A, int B, int C){
        // code here
        
        if(C==0){//if the diffrence is 0 then all the terms are nothing but just A 
            if(A==B){
                return 1;
            }
            return 0;
        }
        
        if(A==B){
            return 1;
        }
        
        if((B-A)%C==0){
            if((B-A)/C>0){
                return 1;
            }
        }
        return 0;
    }
}
