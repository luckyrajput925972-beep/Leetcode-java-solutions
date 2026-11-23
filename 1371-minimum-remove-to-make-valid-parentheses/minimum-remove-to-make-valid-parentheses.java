
class Solution {
    public String minRemoveToMakeValid(String s) {

        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {
                stack.push(i);
            }
            else if (s.charAt(i) == ')') {

                if (stack.isEmpty()) {
                    list.add(i);
                }
                else {
                    stack.pop();
                }
            }
        }

        while (!stack.isEmpty()) {
            list.add(stack.pop());
        }

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            if (!list.contains(i)) {
                ans.append(s.charAt(i));
            }
        }

        return ans.toString();
    }
}
