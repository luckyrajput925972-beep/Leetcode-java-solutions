class Solution {
    public int maxRepeating(String sequence, String word) {
        StringBuilder sb=new StringBuilder();
        int c=0;

        while(true){
            sb.append(word);
            if(sequence.contains(sb.toString())){
                c++;
            }else{
                break;
            }
        }
        return c;
    }
}