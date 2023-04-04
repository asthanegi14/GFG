class Solution{
	int minSteps(String str) {
		//Write your code here
		
		int count=0;
		int ac=0, bc=0, j=0;
		ArrayList<Character> q = new ArrayList<>();
		q.add(str.charAt(0));
		
		for(int i=0;i<str.length();i++){
		    if(q.get(j)!=str.charAt(i)){
		        q.add(str.charAt(i));
		        j++;
		    }
		}
		
		for(int i:q){
		    if(i=='a'){ac++;}
		    else{bc++;}
		}
		return Math.min(ac, bc)+1;
	}
}
