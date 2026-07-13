class Solution {
    public int numJewelsInStones(String jewels, String stones) {
      int count=0;
        char arr[]=jewels.toCharArray();
        char a[]=stones.toCharArray();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<a.length;j++){
                if(arr[i]==a[j]){
                    count++;
                }
            }
        }
   return count;
    }
}