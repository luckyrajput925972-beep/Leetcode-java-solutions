class Solution {
    public static boolean isVowel(char ch){
            return ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u';
        }
    public int maxVowels(String s, int k) {

        int ans=0;
        int c=0;
            for(int i=0;i<k;i++){
                char ch = s.charAt(i);
                if(isVowel(ch)){
                    c++;
                }
            }
            ans = c;
            
            for(int i=k;i<s.length();i++){
                char ch = s.charAt(i);
                if(isVowel(ch)){
                        c++;
                    }
                if(isVowel(s.charAt(i-k))){
                    c--;
                }

              ans=Math.max(ans,c);
            
        }
        return ans;
    }
}