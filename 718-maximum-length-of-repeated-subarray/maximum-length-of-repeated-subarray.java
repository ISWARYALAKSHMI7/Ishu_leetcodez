class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        
        int m = nums1.length;
        int n = nums2.length;

        int[] dp = new int[n+1];
        int max = 0;

        for(int i = m-1; i >= 0; i--){

            int diagonal = 0;

            for(int j = n-1; j >= 0; j--){

                int temp = dp[j];

                if(nums1[i] == nums2[j]){
                    dp[j] = 1 + diagonal;
                    max = Math.max(dp[j], max);
                }
                else{
                    dp[j] = 0;
                }

                diagonal = temp;
            }
        }

        return max;

    }
}