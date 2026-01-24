Leetcode 121 best time to by and sell stock
  //TimeCommplexity = O(n)
  //SpaceComplexity = O(1)

class BuyandSellStock {
    public int thirdMax(int[] nums) {
         int minimumPrice = nums[0];
        int maxProfit = 0;
           for (int i = 1; i < nums.length; i++) {
             if (nums[i] < minimumPrice) {
                minimumPrice = nums[i];
            } else {
                int profit = nums[i] - minimumPrice;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }

        return maxProfit;
        

           
        
    }
}
