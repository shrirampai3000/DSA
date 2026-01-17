class Solution {
    public boolean isMonotonic(int[] nums) {
        int incBreak = 0;
        int decBreak = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) incBreak++;
            if (nums[i] < nums[i + 1]) decBreak++;
        }

        return incBreak == 0 || decBreak == 0;
    }
}
