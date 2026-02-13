Leetcode 283 - Move Zeroes
  //Time Complexity : O(n)
  //Space complexity : O(1)
  class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int insertPosition = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i]!=0){
                nums[insertPosition] = nums[i];
                insertPosition++;
            }

        }
        while(insertPosition <nums.length){
            nums[insertPosition] = 0;
            insertPosition++;
        }
        
    }
}
