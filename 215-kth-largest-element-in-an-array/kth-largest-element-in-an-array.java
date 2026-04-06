class Solution {
    public int findKthLargest(int[] nums, int k) {
        //with sorting
        // Arrays.sort(nums);
        // return(nums[nums.length - k]);
        //without sorting


        // Step 1: Initialize a Min-Heap using PriorityQueue
        // In Java, PriorityQueue is a min-heap by default.
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        // Step 2: Iterate through the array
        for (int n: nums) {
            // Add the current number to the heap
            minHeap.add(n);
            // Step 3: If the heap size exceeds k, remove the smallest element
            // This ensures the heap only keeps the k largest elements seen so far
            if(minHeap.size() > k) {
                minHeap.poll();
            }
        }
        // Step 4: The root of the heap is the kth largest element
        return minHeap.peek();
    }
}