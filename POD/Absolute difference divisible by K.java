class Solution {
	static long countPairs(int n, int[] arr, int k) {
		// code here
		
		long ans=0;
		int[] a = new int[k];
		
		for(int i=0;i<arr.length;i++){
		    ans+=(long)a[arr[i]%k];
		    a[arr[i]%k]++;
		}
		return ans;
	}
}
