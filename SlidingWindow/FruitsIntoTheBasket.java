Leetcode 904: Fruit Into Baskets
  //Time complexity : O(n)
  //Spcae complexity :O(1)
class FruitsIntoTheBasket {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> map = new HashMap<>();

        int left = 0;
        int maxFruits = 0;

        for(int right = 0; right < fruits.length;right++){
            int fruit = fruits[right];

            if(map.containsKey(fruit)){
                map.put(fruit,map.get(fruit)+1);
            }else{
                map.put(fruit,1);
            }
        
        while (map.size() > 2) {
                int leftFruit = fruits[left];
                map.put(leftFruit, map.get(leftFruit) - 1);

                if (map.get(leftFruit) == 0) {
                    map.remove(leftFruit);
                }

                left++;
            }

            int currentLength = right - left + 1;
            if (currentLength > maxFruits) {
                maxFruits = currentLength;
            }
        }

        return maxFruits;
        
    }
}
