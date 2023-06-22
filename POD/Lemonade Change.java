class Solution {
    static boolean lemonadeChange(int N, int bills[]) {
        // code here
        int a=0, b=0;
        for(int i=0;i<N;i++){
            if(bills[i]==5){
                a++;
            }
            if(bills[i]==10){
                b++;
                if(a==0){
                    return false;
                }
                a--;
            }
            if(bills[i]==20){
                if(a>0 && b>0){
                    a--;
                    b--;
                }
                else if(a>=3){
                    a-=3;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}
