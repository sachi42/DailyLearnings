class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        Integer majority = null;
        for(int n: nums) {
            if (count == 0) {
                majority = n;
            }
            if (n == majority) {
                count = count + 1;
            } else {
                count = count - 1;
            }
        }
        return majority;

        //Using the HashMap
        // Step 1: Create a frequency table (Map)
        // Key = the number, Value = how many times it appeared
        // Map<Integer, Integer> counts = new HashMap<>();
        
        // int n = nums.length;

        // // Step 2: Iterate through the array
        // for (int num : nums) {
        //     // Get current count of 'num', or 0 if it's the first time seeing it
        //     int currentCount = counts.getOrDefault(num, 0) + 1;
            
        //     // Step 3: Update the map with the new count
        //     counts.put(num, currentCount);

        //     // Step 4: Check if this number is now the majority
        //     if (currentCount > n / 2) {
        //         return num;
        //     }
        // }

        // return -1; // Should never happen based on problem constraints
    }
}