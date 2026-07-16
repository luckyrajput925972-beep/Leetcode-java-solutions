import java.util.*;

class Solution {

    public static void findcombinations(int ind, int[] arr, int target,
                                        List<List<Integer>> ans,
                                        List<Integer> ds) {

        // Base Case
        if (ind == arr.length) {
            if (target == 0) {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }

        // Take
        if (arr[ind] <= target) {
            ds.add(arr[ind]);

            // Same element ko dubara use kar sakte hain
            findcombinations(ind, arr, target - arr[ind], ans, ds);

            // Backtracking
            ds.remove(ds.size() - 1);
        }

        // Don't Take
        findcombinations(ind + 1, arr, target, ans, ds);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> ans = new ArrayList<>();

        findcombinations(0, candidates, target, ans, new ArrayList<>());

        return ans;
    }
}