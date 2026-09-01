class Solution {
    public String frequencySort(String s) {
        
        Map<Character, Integer> map = new HashMap<>();
        for(char i: s.toCharArray()){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        List<Character> list = new ArrayList<>(map.keySet());
        Collections.sort(list, (a,b) -> map.get(b) - map.get(a));

        StringBuilder ans = new StringBuilder();
        for(char ch:list){
            int count = map.get(ch);
            while(count --> 0 ){
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}