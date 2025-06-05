class Solution {
    public int maxProduct(int[] nums) {
       int maxproduct = Integer.MIN_VALUE;
       int prifix = 1;
       int suffix = 1;
       int n = nums.length;
 for(int i = 0;i<nums.length;i++) {
        if(prifix == 0){
        prifix = 1;
       }
       if(suffix == 0) {
        suffix = 1;
       }
        prifix = prifix * nums[i];
        suffix = suffix * nums[n-i-1];
       maxproduct = Math.max(maxproduct,Math.max(prifix,suffix));


       }
       return maxproduct;
    }
}