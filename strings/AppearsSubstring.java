Leetcode 1967 : Number of Strings That Appear as Substrings in Word
  //Time complexity: O(n)
  //Space Complexity :O(1)
  class AppearsSubstring {
    public int numOfStrings(String[] patterns, String word) {
        int count = 0;

        for (int i = 0; i < patterns.length; i++) {
            if (word.contains(patterns[i])) {
                count++;
            }
        }

        return count;
    
    }
}
  
