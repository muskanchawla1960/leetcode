Day 3 : Finding smaller numbers than the current one
  // Time complexity = O(n^2)
  //Space complexity = O(n)

  class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {

        int[] newArray = new int[nums.length];
        for (int i = 0; i < nums.length;i++){
            int count = 0;
            for(int j = 0; j<nums.length;j++){
                if(nums[i]>nums[j]){
                    count++;
                }
            }
            newArray[i] = count;

        }
        return newArray;
        
    }
}
  
