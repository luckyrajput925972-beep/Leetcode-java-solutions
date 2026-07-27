class Solution {
    public int subtractProductAndSum(int n) {
        int pro=1;
        int sum=0;
        int result;
        while(n>0){
            int digit=n%10;
            sum=sum+digit;
            pro=pro*digit;
          n=n/10;
            
        }
        result=pro-sum;
        return result;
    }
}