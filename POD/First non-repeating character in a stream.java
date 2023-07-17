class Solution
{
    public String FirstNonRepeating(String A)
    {
        // code here
        HashMap<Character, Integer> map = new HashMap<>();
        StringBuffer sb = new StringBuffer();
        int j=0;
        
        for(int i=0;i<A.length();i++){
            char c = A.charAt(i);
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
                while(j<=i && map.get(A.charAt(j))>1){
                    j++;
                }
            }
            else{
                map.put(c, 1);
            }
            
            if(j<=i){
                sb.append(A.charAt(j));
            }
            else{
                sb.append('#');
            }
        }
        // return sb.toString();
        return sb.toString();
    }
}
