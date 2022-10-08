 public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest = nums[0] + nums[1] + nums[2];
        for(int i = 0;i<=nums.length -3;i++){
            int second = i + 1;
            int third = nums.length - 1;
            while(second < third){
                int tempSum = nums[third] + nums[second] + nums[i];
                if(tempSum == target){
                    return tempSum;
                }else if(tempSum < target){
                    ++second;
                }else if(tempSum > target){
                    --third;
                }
                closest = getClosest(closest,tempSum,target);
            }
        }
        return closest;
    }
    
    private int getClosest(int val1, int val2, int target){
        int temp1 = target - val1;
        int temp2 = target - val2;
        if(temp1 < 0){
            temp1 *= -1;
        }if(temp2 < 0 ){
            temp2 *= -1;
        }
        return temp1 < temp2 ? val1 : val2;
    }