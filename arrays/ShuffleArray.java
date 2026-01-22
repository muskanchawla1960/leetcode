LeetCode 1470: Shuffle the array
  //Time Complxity = O(n)
  //Space Complexity = O(n)

  class ShuffleArray {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int index = 0;
        for(int i = 0; i < n;i++){
            ans[index] = nums[i];
            index++;
            ans[index] = nums[i+n] ; 
            index++;    
              }
              return ans;
        
    }
    
}
