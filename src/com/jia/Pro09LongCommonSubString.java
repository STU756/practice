package com.jia;

public class Pro09LongCommonSubString {
	/*
	 * Time:O(nm)
	 * Space:O(nm)
	 */
	public static int longestCommonSubstring(String one, String two) {
		int maxLength = 0;
		int n = one.length();
		int m = two.length();
		if(n == 0 || m == 0)
			return 0;
		int[][] dp = new int[n][m];
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(one.charAt(i) == two.charAt(j)) {
					if(i == 0 || j == 0)
						dp[i][j] = 1;
					else 
						dp[i][j] = dp[i-1][j-1] + 1;
					if(dp[i][j] > maxLength)
						maxLength = dp[i][j];
				}
			}
		}
		
		return maxLength;
	}
	public static void main(String[] args) {
		System.out.println(longestCommonSubstring("abcdjia", "ertjiaw"));;
	}
}
