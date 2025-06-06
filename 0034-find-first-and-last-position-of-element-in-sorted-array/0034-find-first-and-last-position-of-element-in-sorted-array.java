class Solution {
    public int[] searchRange(int[] nums, int target) {
    int first = firstoccurence(nums,target);
    int last =  lastoccurence(nums,target);
    return new int[]{first,last};
    }
    static int firstoccurence(int nums[],int target) {
      int n = nums.length;
      int left = 0;
      int right = n-1;
      int first = -1;
      while(left <= right) {
        int mid = (left + right)/2;
        if(nums[mid] == target) {
            first = mid;
            right = mid-1;
        }
        else if(nums[mid] < target) {
            left = mid+1;
        }
        else {
            right = mid-1;
        }
      }
      return first;
    }
    static int lastoccurence(int nums[],int target) {
        int n = nums.length;
        int left = 0;
        int right = n-1;
        int last  = -1;
        while(left <= right) {
            int mid = (left + right)/2;
            if(nums[mid] == target) {
                last = mid;
                left = mid+1;
            }
            else if (nums[mid] < target) {
                left = mid +1;
            }
            else {
                right = mid -1;
            }

        }
        return last;
    }
}