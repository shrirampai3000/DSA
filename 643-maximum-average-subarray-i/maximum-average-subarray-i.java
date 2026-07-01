class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int left = 0;
        int curr = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int right = 0; right < nums.length; right++) {

            curr += nums[right];

            if (right - left + 1 > k) {
                curr -= nums[left];
                left++;
            }

            if (right - left + 1 == k) {
                maxSum = Math.max(maxSum, curr);
            }
        }

        return (double) maxSum / k;
    }
}