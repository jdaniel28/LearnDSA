class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length -1;
        int[] finalArr = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            int leftSq = nums[left] * nums[left];
            int rightSq = nums[right] * nums[right];
            if(rightSq > leftSq){
                finalArr[nums.length-1-i] = rightSq;
                --right;
            }else{
                finalArr[nums.length-1-i]=leftSq;
                ++left;
            }
        }
        return finalArr;
    }
}