import java.util.*;
class Solution {
    public int firstUniqChar(String s) {
        // Map<Character,Integer> map = new HashMap<>();

        // for(char i:s.toCharArray()){
        //     map.put(i, map.getOrDefault(i,0)+1);
        // }

        // for(int i=0;i<s.length();i++){
        //     char c=s.charAt(i);
        //     if(map.get(c)==1){
        //         return i;
        //     }
        // }

        // return -1;

        int[] freq = new int[26];

        for(char i : s.toCharArray()){
            freq[i- 'a']++;
        }

        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            if(freq[c - 'a'] == 1){
                return i;
            }
        }
        return -1;
    }
}