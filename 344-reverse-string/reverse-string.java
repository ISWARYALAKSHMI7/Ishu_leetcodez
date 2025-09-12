class Solution {
    public void reverseString(char[] s) {
        char[] m=new char[s.length];
      for(int i=0,j=s.length-1;i<j;i++,j--){
        char t=s[i];
        s[i]=s[j];
        s[j]=t;
      }System.out.print(Arrays.toString(s));
    }
}