class Solution {
    public int majorityElement(int[] nums) {
        // int count = 0;
        // Integer majority = null;
        // for(int n: nums) {
        //     if (count == 0) {
        //         majority = n;
        //     }
        //     if (n == majority) {
        //         count = count + 1;
        //     } else {
        //         count = count - 1;
        //     }
        // }
        // return majority;

        //Using the HashMap
        int n= nums.length;
        Map<Integer, Integer> counts = new HashMap<>();
        for (int num: nums) {
            int currentCount = counts.getOrDefault(num, 0) + 1;
            counts.put(num, currentCount);
            if (currentCount > n/2) {
                return num;
            }
        }
        return -1;
    }
}