class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for(int i =0;i<k;i++){
            sum+=nums[i];
        }
        int maxsum = sum;
        int n = nums.length;
        int startindex = 0;
        int endindex = k;
        
        while(endindex < n) {
            sum -=nums[startindex];
            startindex++;
            sum += nums[endindex];
            endindex++;

            maxsum = Math.max(maxsum,sum);
        }
        return (double) maxsum/k;
    }
}