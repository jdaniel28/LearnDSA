 public void moveZeroes(int[] nums) {
        int left = 0;  first zero occurence
        int right =0;  first non zero occurence
        while(right  nums.length && left  nums.length){
            if(nums[left] != 0){
                ++left;
            }else if(nums[right] == 0){
                ++right;
            }
            else if(left  right){
                nums[left] = nums[right];
                nums[right] = 0;
            }
            else if(rightleft){
                right = left;
            }else{
                break;
            }
        }
    }