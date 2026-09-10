class Solution {
    public int[] singleNumber(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int arr[]=new int[2];
        for(int i:nums){
            if(set.contains(i)){
                set.remove(i);
           } else{

            set.add(i);
            }
        }
        int i=0;
        for(int t:set){
            arr[i]=t;
            i++;
        }
        return arr;
    }
}