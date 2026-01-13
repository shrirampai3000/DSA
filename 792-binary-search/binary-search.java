class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int low=0;
        int end=n-1;
        while(low<=end){
            int mid = low + (end - low) / 2;;
            if (nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                end=mid-1;
            }
        }return -1;
    }
}