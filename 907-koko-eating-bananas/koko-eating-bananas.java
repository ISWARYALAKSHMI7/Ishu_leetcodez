class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int low = 1;
        int high = 0;
        for(int num: piles) high = Math.max(num, high);

        while(low <= high){

            int mid = low + (high - low)/2;
            long sum = 0;

            for(int i = 0; i < piles.length; i++){
                sum += ( piles[i] + mid - 1 ) / mid;
            }

            if(sum > h){
                low = mid + 1;
            }else{
                high = mid - 1;
            }

        }

        return low;
        
    }
}