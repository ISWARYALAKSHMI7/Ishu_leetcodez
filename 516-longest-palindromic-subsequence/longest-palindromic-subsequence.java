class Solution {
    public int longestPalindromeSubseq(String s) {

        int n = s.length();
        
        int[] dp = new int[n];

        for(int i = 0; i < n; i++){
            dp[i] = 1;
        }

        for(int i = n-1; i >= 0; i--){
            int diagonal = 0;
            for(int j = i+1; j < n; j++){
                int temp = dp[j];
                if(s.charAt(i) == s.charAt(j)){
                    dp[j] = 2 + diagonal;
                }
                else{
                    dp[j]= Math.max(dp[j-1], dp[j]);
                }
                diagonal = temp;
            }
        }

        return dp[n-1];

    }
}