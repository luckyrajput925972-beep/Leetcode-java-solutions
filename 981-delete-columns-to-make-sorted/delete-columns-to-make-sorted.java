class Solution {
    public int minDeletionSize(String[] strs) {
        int count=0;
        int row=strs.length;
        int col=strs[0].length();
        for(int j=0;j<col;j++){
            for(int i=0;i<row-1;i++){
                if(strs[i].charAt(j) > strs[i+1].charAt(j)){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}