My Day 1 : Running Sum Array Problem

// Problem Description: Running Sum of 1D array
// Time Complexity : O(n)
// Space Complexity : O(1)

  public class RunningSumSolution {
    public int[] runningSum(int[] nums) {
        for(int i = 1; i < nums.length;i++){
            nums[i] = nums[i-1]+nums[i];
        }
        return nums;

        
    }
}
