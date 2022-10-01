class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] finalArr=new int[2];
        int left = 0;
        int right = numbers.length-1;
        while(left<right){
            int sum = numbers[left] + numbers[right];
            if(sum==target){
                finalArr[0]=left+1;
                finalArr[1]=right+1;
                return finalArr;
            }else if(sum<target){
                ++left;
            }else if(sum>target){
                --right;
            }
        }
        return finalArr;
    }
}