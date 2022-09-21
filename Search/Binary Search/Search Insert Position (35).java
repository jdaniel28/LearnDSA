class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        int res = 0;
        while(low<=high){
            int half = low + (high - low) / 2;
            System.out.println(half);
            if(nums[half]== target){
                return half;
            }else if(nums[half]>target){
                high = half - 1;
                res = half - 1;
            }else if(nums[half]<target){
                low = half + 1;
                res = half;
            }            
        }
        return res+1;
    }
}