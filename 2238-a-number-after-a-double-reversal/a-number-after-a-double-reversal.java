class Solution {
    public boolean isSameAfterReversals(int num) {
        int revrse1=reverse(num);
        int revsre2=reverse(revrse1);
      return  revsre2==num;
    }
        public int reverse(int n){
        int reverse=0;
        while(n>0){
            int temp=n%10;
            reverse=reverse*10+temp;
            n/=10;
        }
        return reverse;
    }
}