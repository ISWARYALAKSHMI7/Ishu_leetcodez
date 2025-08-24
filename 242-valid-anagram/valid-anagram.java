class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        int[] r = new int[26];
        for (int i = 0; i < s.length(); i++) {
            r[s.charAt(i) - 'a']++;
            r[t.charAt(i) - 'a']--;
        }
        
        for (int i = 0; i < r.length; i++) {
            if (r[i] != 0) {
                return false;
            }
        }
        return true;
    }
}