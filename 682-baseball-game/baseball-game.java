class Solution {
    public int calPoints(String[] operations) {
        int[] score = new int[operations.length];
        int k = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("C")) {
                k--;
            }
            else if (operations[i].equals("D")) {
                score[k] = 2 * score[k - 1];
                k++;
            }
            else if (operations[i].equals("+")) {
                score[k] = score[k - 1] + score[k - 2];
                k++;
            }
            else {
                score[k] = Integer.parseInt(operations[i]);
                k++;
            }
        }

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += score[i];
        }
        return sum;
    }
}