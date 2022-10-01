 public void rotate(int[] nums, int k) {
       k = k % nums.length;
        for(int i = 0;i<nums.length/2;i++){
            int temp= nums[nums.length-i-1];
            nums[nums.length-i-1] = nums[i];
            nums[i] = temp;
        }
        for(int i = 0;i<k/2;i++){
            int temp= nums[k-i-1];
            nums[k-i-1] = nums[i];
            nums[i] = temp;
        }
        for(int i =0;i<(nums.length -k)/2;i++){
            int temp = nums[i+k];
            nums[i+k] = nums[nums.length-i-1];
            nums[nums.length-i-1] = temp;
        }
    }