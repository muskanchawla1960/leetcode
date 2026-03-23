LeetCode 713 : Subarray Product Less Than K
  //Time Complexity :O(n)
  //Space Complexity :O(1)

  class SubarrayProductLessThanK {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count = 0;
        
        if (k <= 1) {
            return 0;
        }

        int left = 0;
        int product = 1;

        for (int right = 0; right < nums.length; right++) {
            product = product * nums[right];

            while (product >= k) {
                product = product / nums[left];
                left++;
            }

            count = count + (right - left + 1);
        }

        return count;
        
    }
}
