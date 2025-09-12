class Solution {
    public int lengthOfLastWord(String s) {
        String[] m=s.split(" ");
        String last=m[m.length-1];
        return last.length();
    }
}