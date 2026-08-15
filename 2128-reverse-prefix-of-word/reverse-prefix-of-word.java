class Solution {
    public String reversePrefix(String word, char ch) {

        int index = word.indexOf(ch);

        StringBuilder rev = new StringBuilder();

        for(int i = index; i >= 0; i--) {
            rev.append(word.charAt(i));
        }

        rev.append(word.substring(index + 1));

        return rev.toString();
    }
}