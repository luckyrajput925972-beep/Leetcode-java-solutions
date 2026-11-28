class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();
        for(int i=0; i<num.length(); i++){
            char ch = num.charAt(i);
            while(!st.isEmpty() && k > 0 && st.peek()-'0'>ch-'0'){
                st.pop();
                k--;
            }
            st.push(ch);
        }
        while(k>0){
            st.pop();
            k--;
        }
        StringBuilder ans = new StringBuilder();
        for(int i=0; i<st.size(); i++){
            ans.append(st.get(i));
        }
        int i = 0;
        while(ans.length()>0 && ans.charAt(i)=='0'){
            ans.deleteCharAt(i);
        }
        if(ans.length()==0) return "0";
        return ans.toString();
    }
}
