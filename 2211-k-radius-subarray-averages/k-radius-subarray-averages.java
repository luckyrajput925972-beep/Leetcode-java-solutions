class Solution {
    public int[] getAverages(int[] nums, int k) {
        int arr[]=new int [nums.length];
    Arrays.fill(arr,-1);
   if(k==0)return nums;
  
int n=2*k+1;
long sum=0;
long avg=0;
if(n>nums.length){
    return arr;
}
for(int i=0;i<n;i++){
    sum+=nums[i];

}
avg=sum/n;
arr[k]=(int)avg;
k++;
   int l=0;
   int r=n;
   while(r<nums.length){
    sum+=nums[r]-nums[l];
  avg=sum/n;
  arr[k++]=(int)avg;
  l++;
  r++;
   }
   return arr;
    
   }

}