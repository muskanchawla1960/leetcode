 LeetCode 53 : Maximum Subarray
  //Time Complexity : O(n)
  //SpaceComplexity: O(1)
  //Optimized Solution
   class MaximumSubarray {
    public int maxSubArray(int[] nums) {
      int currentSum = 0;
      int maxSum = Integer.MIN_VALUE;

      for(int i = 0; i < nums.length; i++){
        currentSum += nums[i];
        if(currentSum> maxSum){
            maxSum = currentSum;
        }
        if (currentSum < 0){
            currentSum = 0;
        }
      }
      return maxSum;
        
    }
}
