class Solution {
    public boolean canAliceWin(int[] nums) {
      int single=0;
      int doble=0;
      int total=0;
      for(int i=0;i<nums.length;i++){
        total+=nums[i];
        if(nums[i]>=1&&nums[i]<=9){
            single+=nums[i];
        }
        else{
            doble+=nums[i];
        }
      }  
    
if(single>total-single){
return true;
}
else if(doble>total-doble){
    return true;
}
return false;
    }
}