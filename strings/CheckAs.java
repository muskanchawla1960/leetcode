LeetCode 2124 — Check if All A’s Appear Before All B’s
  class Solution {
    public boolean checkString(String s) {
         boolean check = false;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'b') {
                check = true;
            }
            if (s.charAt(i) == 'a' && check) {
                return false;
            }
        }

        return true;
        
    }
}
