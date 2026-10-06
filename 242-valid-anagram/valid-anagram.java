class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        char []arr=s.toCharArray();
        char []rrr=t.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(rrr);
        return Arrays.equals(arr,rrr);

        
    }
}