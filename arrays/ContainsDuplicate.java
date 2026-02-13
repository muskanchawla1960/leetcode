class Solution {
  //Optimized Solution
  //Time Commplexity : O(n)
  //Space Complexity :O(n)
    public boolean containsDuplicate(int[] nums) {
       HashSet<Integer> set = new HashSet<>();

        for(int num : nums) {

            if(set.contains(num)) {
                return true;
            }

            set.add(num);
        }

        return false;
    }
}
