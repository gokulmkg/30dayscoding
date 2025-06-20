class Solution {
    public int maxSubArray(int[] nums) {
       int maxsum = Integer.MIN_VALUE;
       int sum = 0;
      for(int  i =0;i<nums.length;i++) {
           sum += nums[i];
            
            if(sum > maxsum){
            maxsum = Math.max(maxsum,sum);
          }
          if(sum < 0) {
            sum = 0;
          }
      }
     return maxsum;
    }
}