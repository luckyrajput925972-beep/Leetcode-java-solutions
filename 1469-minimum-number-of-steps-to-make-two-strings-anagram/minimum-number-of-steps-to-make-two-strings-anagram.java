class Solution {
    public int minSteps(String s, String t) {
        int frq[]=new int[26];
        int count=0;
        for(int i=0;i<s.length();i++){
            frq[s.charAt(i)-'a']++;
            frq[t.charAt(i)-'a']--;
        }
        for(int x:frq){
            if(x>0){
                count+=x;
            }
        }
        return count;
    }
}