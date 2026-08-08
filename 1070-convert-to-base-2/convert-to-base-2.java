class Solution {
    public String baseNeg2(int n) {
        if(n==0)return "0";

    StringBuilder result=new StringBuilder();
    while(n!=0){
        int bit=n&1;
        result.append(bit);
        n=(n-bit)/-2;
    }
    return result.reverse().toString();
    }
}