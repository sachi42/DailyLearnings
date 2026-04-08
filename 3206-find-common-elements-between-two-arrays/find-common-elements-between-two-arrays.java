class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<>();
        for (int n: nums1) s1.add(n);
        Set<Integer> s2 = new HashSet<>();
        for (int n: nums2) s2.add(n);

        int a1 = 0;
        int a2 = 0;
        for (int n: nums1) {
            if (s2.contains(n)) {
                a1++;
            }
        }

        for (int n: nums2) {
            if (s1.contains(n)) {
                a2++;
            }
        }
        return new int[] {a1, a2};
    }
}