class Solution {
    public int maxInstance(String s) {
        // Code here
        int[] ch = new int[26];
        
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='b' || c=='a' || c=='l' || c=='o' || c=='n'){
                ch[c-'a']++;
            }
        }
        
        ch['l'-'a'] = ch['l'-'a']/2;
        ch['o'-'a'] = ch['o'-'a']/2;
        int min=Integer.MAX_VALUE;
        
        for(int i=0;i<26;i++){
            if(i=='b'-'a' || i=='a'-'a' || i=='l'-'a' || i=='o'-'a' || i=='n'-'a'){
                min = Math.min(min, ch[i]);
            }
        }
        return min;
    }
}
