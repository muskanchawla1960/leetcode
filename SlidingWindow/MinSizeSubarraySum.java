Leetcode 209 : Minimum Size Subarray Sum
  // Time Complexity : O(n)
  // Space complexity :O(1)
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int minLength = Integer.MAX_VALUE;
        int sum = 0;
        for (int right = 0; right < nums.length;right++ ){
            sum += nums[right];

            while(sum>=target){
                int length = right-left+1;
                if(length < minLength){
                    minLength = length;
                }
                sum = sum-nums[left];
                left++;
            }
        }
         if(minLength == Integer.MAX_VALUE){
            return 0;
        }
        return minLength;
        
    }
}
