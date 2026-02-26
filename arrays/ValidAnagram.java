Leetcode 242: Valid Anagram
  //Time Complexity :  O(n)
  //Spcae Complexity :O(1)

  class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        boolean isAnagram = true;

        if (s.length() != t.length()) {
            isAnagram = false;
        } else {

            HashMap<Character, Integer> map = new HashMap<>();

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                map.put(c, map.getOrDefault(c, 0) + 1);
            }

            int i = 0;
            while (i < t.length() && isAnagram) {

                char c = t.charAt(i);

                if (!map.containsKey(c)) {
                    isAnagram = false;
                } else {
                    map.put(c, map.get(c) - 1);

                    if (map.get(c) == 0) {
                        map.remove(c);
                    }
                }

                i++;
            }

            if (!map.isEmpty()) {
                isAnagram = false;
            }
        }

        return isAnagram;
    
        
    }
}
