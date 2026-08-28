class Solution {
    public String reverseWords(String s) {

        String[] words = s.split(" ");

        StringBuilder st = new StringBuilder();

        for (int i = 0; i < words.length; i++) {

            StringBuilder word = new StringBuilder(words[i]);

            st.append(word.reverse());

            if (i != words.length - 1) {
                st.append(" ");
            }
        }

        return st.toString();
    }
}
