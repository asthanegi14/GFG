class Solution
{
    /*You are required to complete this method*/
    int findK(int A[][], int n, int m, int k)
    {
    	// Your code here	
    	int i=0, j=m-1, top=0, btm=n-1;
    	
    	while(i<=j && top<=btm){
        	for(int l=i;l<=j;l++){
        	    if(k==1){
        	        return A[top][l];
        	    }
        	    k--;
        	}
        	
        	top++;
        	
        	for(int l=top;l<=btm;l++){
        	    if(k==1){
        	        return A[l][j];
        	    }
        	    k--;
        	}
        	j--;
        	
        	if(top<=btm){
        	    for(int l=j;l>=i;l--){
        	        if(k==1){
        	            return A[btm][l];
        	        }
        	        k--;
        	    }
        	    btm--;
        	}
        	
        	if(i<=j){
        	    for(int l=btm;l>=top;l--){
        	        if(k==1){
        	            return A[l][i];
        	        }
        	        k--;
        	    }
        	    i++;
        	}
    	}
    	return 0;
    }
}
