class Solution
{
    //Function to find the first non-repeating character in a string.
    static char nonrepeatingCharacter(String S)
    {
        //Your code here
        int[] ch = new int[26];
        
        for(int i=0;i<S.length();i++){
            char c = S.charAt(i);
            ch[c-'a']++;
        }
        for(int i=0;i<S.length();i++){
            char c = S.charAt(i);
            if(ch[c-'a']==1){
                return c;
            }
        }
        return '$';
    }
}
