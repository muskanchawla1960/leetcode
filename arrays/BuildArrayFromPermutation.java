 Solution for leetcode problem Build Array from Permutation

  //Time Complexity :O(n)
  //Space Complexity : O(n)

class arrayFromPermutation {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i = 0; i < ans.length;i++){
            ans[i] = nums[nums[i]];

        }
        return ans;

        
    }
}
