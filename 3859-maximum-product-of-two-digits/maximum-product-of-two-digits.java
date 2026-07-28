class Solution {
    public int maxProduct(int n) {
        int max=0;
        int max1=0;
        int pro=0;
       while(n>0){
        int temp=n%10;
        if(temp>max){
            max1=max;
            max=temp;
        }else if(temp>max1){
            max1=temp;
        }
        
        
        n=n/10;
        
       } 
       pro=max1*max;
       return pro;
    }
}