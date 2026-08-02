class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumev=0;
        int sumod=0;
        for(int i=1;i<n*(n+1);i++){
            if(i%2==0){
                sumev+=i;
            }else{
                sumod+=i;
            }
            if(sumev%n==0&&sumod%n==0){
                return n;
            }
        }
        return n;
    }
}