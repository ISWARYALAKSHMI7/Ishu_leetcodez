class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        Arrays.sort(candidates);
        
        List<Integer> curr = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        
        backtrack(candidates, 0, target, curr, res);

        return res;

    }

    static void backtrack(int[] candidates, int start, int rem, List<Integer> curr, List<List<Integer>> res){

        if(rem == 0){
            res.add(new ArrayList<>(curr));
            return;
        }

        for(int i = start ; i < candidates.length; i++){

            if(candidates[i] > rem){
                break;
            }

            curr.add(candidates[i]);
            backtrack(candidates, i, rem - candidates[i], curr, res);
            curr.remove(curr.size() - 1);

        }

        
    }
}