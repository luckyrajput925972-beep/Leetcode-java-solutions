class Solution {
    public boolean isValid(String s) {
        Stack<Character>stack=new Stack<>();
                boolean f=true;
                for(char c1:s.toCharArray()){
                    if("[{(".indexOf(c1)>=0){
                        stack.push(c1);
                    }else{
                        if(stack.isEmpty())return false;
                        char c2=stack.pop();
                        if(c2=='('&& c1!=')'){
                            f=false;
                            break;
                        }if(c2=='['&& c1!=']'){
                            f=false;
                            break;
                    }if(c2=='{'&& c1!='}'){
                            f=false;
                            break;
                }
                    }

    }
    if(!stack.isEmpty()) return false;
        return f;
    }
}