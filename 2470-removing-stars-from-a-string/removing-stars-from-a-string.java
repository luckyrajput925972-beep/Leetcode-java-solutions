class Solution {
    public String removeStars(String s) {
         Stack<Character> stack=new Stack();
       for(char c:s.toCharArray()){
        if(c!='*'){
            stack.push(c);
        }else{
            if(!stack.empty()){
                stack.pop();
            }
        }
       }
       StringBuilder sb=new StringBuilder();
       while(!stack.empty()){
        sb.append(stack.pop());
       }
       sb.reverse();
       return sb.toString();
       
    }
}