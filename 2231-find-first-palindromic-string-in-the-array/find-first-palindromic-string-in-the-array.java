class Solution {
    public String firstPalindrome(String[] words) {
        
        String result="";
        for(int i=0;i<words.length;i++){
            result=words[i];
            StringBuilder ans=new StringBuilder(words[i]);
            ans.reverse();
            if(ans.toString().equals(result)){
                return result;
                
            }
        }
        return "";
    }
}