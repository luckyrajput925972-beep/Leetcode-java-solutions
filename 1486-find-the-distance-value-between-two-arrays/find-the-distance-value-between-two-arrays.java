class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = 0;
        boolean valid = true;
        for(int i=0; i<arr1.length; i++){
            valid = true;
            for(int j=0; j<arr2.length; j++){
                int x = Math.abs(arr1[i]-arr2[j]);
                if(x <= d){
                    valid = false;
                    break;
                }
            }
            if(valid) count++;
        }
        return count;
    }
}