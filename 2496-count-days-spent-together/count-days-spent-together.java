
class Solution {

    int[] days = {31, 28, 31, 30, 31, 30,
                  31, 31, 30, 31, 30, 31};

    public int dayOfYear(String date) {

        int month = Integer.parseInt(date.substring(0, 2));
        int day = Integer.parseInt(date.substring(3, 5));

        int total = 0;

        for (int i = 0; i < month - 1; i++) {
            total = total + days[i];
        }

        return total + day;
    }

    public int countDaysTogether(
        String arriveAlice,
        String leaveAlice,
        String arriveBob,
        String leaveBob) {

        int startAlice = dayOfYear(arriveAlice);
        int endAlice = dayOfYear(leaveAlice);

        int startBob = dayOfYear(arriveBob);
        int endBob = dayOfYear(leaveBob);

        int start = Math.max(startAlice, startBob);
        int end = Math.min(endAlice, endBob);

        if (start > end) {
            return 0;
        }

        return end - start + 1;
    }
}
