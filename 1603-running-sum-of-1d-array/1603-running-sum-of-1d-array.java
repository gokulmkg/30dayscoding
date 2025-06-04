class Solution {
    public int[] runningSum(int[] nums) {
      
      int index = 1;
        for(int i = 0;i<nums.length;i++){
        if(index > nums.length-1){
            break;
        }
       nums[i+1] = nums[i]+nums[index];
        index++;
       }
       return nums;
    }
}