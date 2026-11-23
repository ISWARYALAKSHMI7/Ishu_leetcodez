class Solution {
    public int minCostClimbingStairs(int[] cost) {

        int prev1 = 0;
        int prev2 = 0;

        for(int n : cost){
            int sum = n + Math.min(prev1, prev2);

            prev2 = prev1;
            prev1 = sum;
        }

        return Math.min(prev1, prev2);

    }
}