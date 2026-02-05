Leetcode 1662: Check If Two String Arrays are Equivalent
//Time Complexity :O(n^2)
//Space Complexity :O(n)
  class CheckStringsEqual {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
         String s1 = "";
         String s2 = "";

        for (int i = 0; i < word1.length; i++) {
            s1 = s1 + word1[i];
        }

        for (int i = 0; i < word2.length; i++) {
            s2 = s2 + word2[i];
        }

        return s1.equals(s2);
        
    }
}
