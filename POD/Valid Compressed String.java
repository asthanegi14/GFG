class Solution {
    static int checkCompressed(String S, String T) {
        // code here
        int i=0, j=0;
        while(i<T.length() && j<S.length()){
            if(Character.isDigit(T.charAt(i))){
            int c = 0;
                while(i<T.length() && Character.isDigit(T.charAt(i))){
                    // System.out.println("s= "+S.charAt(j)+" t= "+T.charAt(i));
                    c = c*10 + (T.charAt(i)-'0');
                    i++;
                }
                j+=c;
            }
            else{
                if(S.charAt(j)!=T.charAt(i)){
                        return 0;
                } 
                else{
                    i++;j++;
                }
            }
        }
        return (j==S.length() && i==T.length())?1:0;
    }
}
