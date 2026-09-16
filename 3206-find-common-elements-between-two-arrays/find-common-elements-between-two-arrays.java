class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int x : nums1) {
            set1.add(x);
        }

        for (int x : nums2) {
            set2.add(x);
        }

        int count = 0;
        int so = 0;

        // nums1 ke elements nums2 mein hain?
        for (int x : nums1) {
            if (set2.contains(x)) {
                count++;
            }
        }

        // nums2 ke elements nums1 mein hain?
        for (int x : nums2) {
            if (set1.contains(x)) {
                so++;
            }
        }

        return new int[]{count, so};
    }
}
