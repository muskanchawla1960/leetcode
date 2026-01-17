Day3:Finding numbers with even number of didgits
  //Time Complexity = O(n)
  //Space Complexity = O(1)
  class FindNumWithEvenDigits {
    public int findNumbers(int[] nums) {
        int sum= 0;
        for(int i = 0;i<nums.length;i++){
            int digits = 0;
            while(nums[i]>0){
                digits++;
                nums[i]=nums[i]/10;
            }
            if(digits%2==0){
                sum++;
            }

            
        }
        return sum;

        
    }
}
