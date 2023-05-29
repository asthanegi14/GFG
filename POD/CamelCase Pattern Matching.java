class Solution{
    boolean isSub(String a, String b){
        // System.out.println("a="+a+" b="+b);
        if(b.length()>a.length()){
            return false;
        }
        int i=0, j=b.length();
        while(i<j){
            if(a.substring(i,j).equals(b)){
                return true;
            }
            i++; j--;
        }
        return false;
    }
    ArrayList<String> CamelCase(int n, String[] dic, String p){
        //code here
        ArrayList<String> arr = new ArrayList<>();
        for(String s: dic){
            String str = "";
            for(int i=0;i<s.length();i++){
                char c = s.charAt(i);
                
                if(c>='A' && c<='Z'){
                    str+=c;
                }
            }
            if(isSub(str, p)){
                arr.add(s);
            }
        }
        Collections.sort(arr);
        if(arr.size()==0){
            arr.add("-1");
            return arr;
        }
        return arr;
    }
}
