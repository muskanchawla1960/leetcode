Leetcode 26: Remove Duplicates from Sorted Array
  //Time complexity :O(n)
  //Space complexity :O(1)
  class DuplicateRemoval {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int pos = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] !=nums[i-1]){
                nums[pos] =nums[i];
                pos++;

            }
            
        }
        return pos;
    }
}
