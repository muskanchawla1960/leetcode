Day 5: Leetcode Solution for Two sum
  // Brute force
  //Time complexity : O(n^2)
  //Space Complexity : O(1)
  
  class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};

                }
            }
        }
        return new int[]{};
    }
}

//Optimized solution
//  //Time complexity : O(n)
  //Space Complexity : O(n)
class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        boolean found = false;
        int i = 0;

        while(i < nums.length && !found) {

            int num = target - nums[i];

            if(map.containsKey(num)) {
                result[0] = map.get(num);
                result[1] = i;
                found = true;
            } else {
                map.put(nums[i], i);
            }

            i++;
        }

        return result;
    }
    }

