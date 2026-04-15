class Solution {
    // public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    //     // Ensure nums1 is the shorter array to keep the binary search efficient
    //     if (nums1.length > nums2.length) {
    //         return findMedianSortedArrays(nums2, nums1);
    //     }

    //     int m = nums1.length;
    //     int n = nums2.length;
    //     int low = 0, high = m;

    //     while (low <= high) {
    //         int partitionX = (low + high) / 2;
    //         int partitionY = (m + n + 1) / 2 - partitionX;

    //         // Edge cases: if partition is at 0, no elements on the left side
    //         // If partition is at max length, no elements on the right side
    //         int maxLeftX = (partitionX == 0) ? Integer.MIN_VALUE : nums1[partitionX - 1];
    //         int minRightX = (partitionX == m) ? Integer.MAX_VALUE : nums1[partitionX];

    //         int maxLeftY = (partitionY == 0) ? Integer.MIN_VALUE : nums2[partitionY - 1];
    //         int minRightY = (partitionY == n) ? Integer.MAX_VALUE : nums2[partitionY];

    //         if (maxLeftX <= minRightY && maxLeftY <= minRightX) {
    //             // Correct partition found
    //             if ((m + n) % 2 == 0) {
    //                 return ((double)Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY)) / 2;
    //             } else {
    //                 return (double)Math.max(maxLeftX, maxLeftY);
    //             }
    //         } else if (maxLeftX > minRightY) {
    //             // Too far right in nums1, move left
    //             high = partitionX - 1;
    //         } else {
    //             // Too far left in nums1, move right
    //             low = partitionX + 1;
    //         }
    //     }

    //     throw new IllegalArgumentException("Input arrays are not sorted.");
    // }

    //using the merge sort approach -
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] merged = new int[m + n];
        
        int i = 0, j = 0, k = 0;

        // Merge both arrays into 'merged' array
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                merged[k++] = nums1[i++];
            } else {
                merged[k++] = nums2[j++];
            }
        }

        // Catch remaining elements from nums1
        while (i < m) {
            merged[k++] = nums1[i++];
        }

        // Catch remaining elements from nums2
        while (j < n) {
            merged[k++] = nums2[j++];
        }

        // Find median
        int total = m + n;
        if (total % 2 == 0) {
            // Even: average of two middle elements
            return (merged[total / 2 - 1] + merged[total / 2]) / 2.0;
        } else {
            // Odd: middle element
            return merged[total / 2];
        }
    }

}
