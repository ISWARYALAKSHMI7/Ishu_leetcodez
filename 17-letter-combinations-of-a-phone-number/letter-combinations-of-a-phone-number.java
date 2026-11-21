class Solution {
    public List<String> letterCombinations(String digits) {
        
        String[] mappings = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

        StringBuilder curr = new StringBuilder();
        List<String> res = new ArrayList<>();

        if(digits.length() == 0){
            return new ArrayList<>();
        }

        backtrack(curr, res, 0, digits, mappings);

        return res;
        
    }

    public static void backtrack(StringBuilder curr, List<String> res, int index, String digits, String[] mappings){

        if(index == digits.length()){
            res.add(curr.toString());
            return;
        }

        char first = digits.charAt(index);
        int num = first - '0';
        String chars = mappings[num];

        for(int i = 0; i < chars.length(); i++){

            char choice = chars.charAt(i);
            curr.append(choice);
            backtrack(curr, res, index+1, digits, mappings);
            curr.deleteCharAt(curr.length() - 1);

        }

    }
}