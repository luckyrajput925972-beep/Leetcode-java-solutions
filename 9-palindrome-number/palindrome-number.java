class Solution {
    public boolean isPalindrome(int x) {
       int rev=0;
       int n=x;
       while(n>0){
        int temp=n%10;
        rev=rev*10+temp;
        n/=10;
       }
       if(x==rev){
        return true;
       }else return false;
    }
}