class Solution {
    public int[] sortArrayByParity(int[] nums) {
        Arrays.sort(nums);
    int arr[]=new int[nums.length];
      int index=0;
for(int i=0;i<nums.length;i++){
    if(nums[i]%2==0){
        arr[index]=nums[i];
        index++;
    }
}
for(int j=0;j<nums.length;j++){
    if(nums[j]%2!=0){
       arr[index]= nums[j];
       index++;
    }
}
return arr;
    }
}