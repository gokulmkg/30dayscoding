class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       int minlenght =Integer.MAX_VALUE;
       int sum = 0;
       int j =0;
        for(int i =0;i<nums.length;i++){
          sum += nums[i];
          while(sum >= target) {
            minlenght =  Math.min(minlenght, i - j + 1);
            sum -= nums[j];
            j++;
          }
           
               if(sum == target) {
                   minlenght= Math.min(minlenght,i-j+1);
               }
              
            }
        
        return (minlenght == Integer.MAX_VALUE)?0:minlenght;
    }
}