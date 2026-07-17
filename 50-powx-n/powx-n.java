class Solution {
    public double myPow(double x, int n) {
        double result=1;
        double pow=n;
        if(n<0){
           x=1/x ;
            pow=-pow;

        }while(pow>0){
        if(pow%2==1){
            result*=x;
            pow--;
        }else{
            x*=x;
            pow/=2;
        }
     
      } 
        
        
      return result; 
    }
}