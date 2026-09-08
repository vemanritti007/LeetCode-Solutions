class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long sum = 0, max = 0;
        int left = 0, distinct = 0, maxValue = 0;
        for (int n : nums) maxValue = Math.max(maxValue, n);
        int[] freq = new int[maxValue + 1];

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            if (freq[nums[right]] == 0) distinct++;
            freq[nums[right]]++;

            if (right - left + 1 == k) {
                if (distinct == k) max = Math.max(max, sum);
                sum -= nums[left];
                freq[nums[left]]--;
                if (freq[nums[left]] == 0) distinct--;
                left++;
            }
        }
        return max;
    }
}