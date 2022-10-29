class Solution{
    static ArrayList<ArrayList<String>> displayContacts(int n, 
                                        String contact[], String s)
    {
        // code here
        // Arrays.sort(contact);
        HashSet<String> set = new LinkedHashSet<>();
        for(int i=0;i<n;i++){
            set.add(contact[i]);
        }
        
        ArrayList<ArrayList<String>> ans = new ArrayList<>();
        char[] c = s.toCharArray();
        String st = "";
        for(int i=0;i<c.length;i++){
            ArrayList<String> arr2 = new ArrayList<>();
            st+=c[i];
            // String st = s.substring(0,i+1);
            // System.out.print("s = "+st+" ");
            for(String str: set){
                // System.out.print("cont = "+contact[j].substring(0,i+1)+" ");
                // if(st.equals(str.substring(0,i+1))){
                if(str.contains(st)){
                    arr2.add(str);   
                }
            }
            if(arr2.isEmpty()){
                arr2.add("0");
            }
            Collections.sort(arr2);
            ans.add(arr2);
        }
        return ans;
    }
}
