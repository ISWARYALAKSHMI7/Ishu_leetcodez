class Solution {

    public int fib(int n) {
        
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        return recursive(n, dp);

    }

    public static int recursive(int n, int[] dp){

        if(n <= 1){
            return n;
        }

        if(dp[n] != -1){
            return dp[n];
        }

        dp[n] = recursive(n-1, dp) + recursive(n-2, dp);

        return dp[n];

    }

}