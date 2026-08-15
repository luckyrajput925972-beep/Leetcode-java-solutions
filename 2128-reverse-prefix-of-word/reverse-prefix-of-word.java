class Solution {
    public String reversePrefix(String word, char ch) {
        int index=word.indexOf(ch);
String rev="";
        String first=word.substring(0,index+1);
        String snd=word.substring(index+1);
        for(int i=first.length()-1;i>=0;i--){
          rev+=first.charAt(i);

        }
        String ans=rev+snd;
        return ans;
    }
}