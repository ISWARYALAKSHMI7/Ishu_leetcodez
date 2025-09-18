class Solution {
    public boolean checkIfPangram(String sen) {
        sen=sen.replaceAll("[^a-z]","");
        Set<String> m= new HashSet<>(Arrays.asList(sen.split("")));
        if(m.size()==26){
            return true;
        }return false;
    }
}