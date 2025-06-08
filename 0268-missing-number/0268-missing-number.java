class Solution {
    public int missingNumber(int[] nums) {
       int n =nums.length;
       int allxor = n;
       for(int i =0;i<n;i++){
        allxor ^=i;
      allxor ^=nums[i];
       }
       return allxor;
    }
}