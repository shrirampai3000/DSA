class Solution {
    public int trap(int[] height) {
        int n = height.length;
        if (n == 0) return 0;

        int left = 0;
        int right = n - 1;

        int leftMax = height[left];
        int rightMax = height[right];

        int trappedWater = 0;

        while (left < right) {
            if (leftMax < rightMax) {
                left++;
                leftMax = Math.max(leftMax, height[left]);
                int waterLevel = leftMax;
                trappedWater += waterLevel - height[left];
            } else {
                right--;
                rightMax = Math.max(rightMax, height[right]);
                int waterLevel = rightMax;
                trappedWater += waterLevel - height[right];
            }
        }

        return trappedWater;
    }
}