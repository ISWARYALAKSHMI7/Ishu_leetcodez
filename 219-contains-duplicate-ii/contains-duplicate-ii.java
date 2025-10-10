class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> a=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!a.add(nums[i])) return true;
            if(a.size()>k) a.remove(nums[i-k]);
        }return false;
    }
}