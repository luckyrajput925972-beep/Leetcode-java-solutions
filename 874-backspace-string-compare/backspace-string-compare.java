class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1=new Stack<>();
        for(char c:s.toCharArray()){
            if(c!='#'){
                s1.push(c);
            }else{
                if(!s1.empty()){
                    s1.pop();
                }
            }
        }
       
        Stack<Character> s2=new Stack<>();
        for(char c:t.toCharArray()){
            if(c!='#'){
                s2.push(c);
            }else{
                if(!s2.empty()){
                    s2.pop();
                }
            }
        }
       
      
       return s1.equals(s2);

    }
}