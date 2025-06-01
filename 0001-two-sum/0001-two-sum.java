class Solution {
    public int[] twoSum(int[] nums, int target) {
  Map<Integer,Integer> mp = new  HashMap<>();
  for(int i =0;i<nums.length;i++) {
   int num = nums[i];
   int remaing = target - num;
   if(mp.containsKey(remaing)) {
      return new int[]{i,mp.get(remaing)};
   }
   mp.put(num,i);
    }
    return nums;   
}
}