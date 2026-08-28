class Solution {
    public int minOperations(int[] nums, int x) {

        int sum = 0;

        for (int n : nums)
            sum += n;

        int target = sum - x;

        if (target < 0)
            return -1;

        if (target == 0)
            return nums.length;

        int left = 0;
        int currSum = 0;
        int max = 0;

        for (int right = 0; right < nums.length; right++) {

            currSum += nums[right];

            while (currSum > target) {
                currSum -= nums[left];
                left++;
            }

            if (currSum == target) {
                max = Math.max(max, right - left + 1);
            }
        }

        return max == 0 ? -1 : nums.length - max;
    }
}