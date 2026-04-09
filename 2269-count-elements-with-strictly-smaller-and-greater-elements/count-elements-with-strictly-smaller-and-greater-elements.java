class Solution {
    public int countElements(int[] nums) {
        int count =0;
        Arrays.sort(nums);
            for (int j=1; j<nums.length-1;j++) {
                if (nums[j] != nums[0] && nums[j]!=nums[nums.length -1]) {
                    count ++;
                }
            }
            return count;
        }
}