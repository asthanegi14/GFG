class Solution 
{ 
    static int xmod11(String x)
	{    
	    // code here
	    int n = x.length(), num=0;
	    for(int i=0;i<n;i++){
	        num = (num*10 + (x.charAt(i)-'0'))%11;
	    }
        return num;
	}
} 
