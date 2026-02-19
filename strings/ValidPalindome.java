Leetcode 125 : Valid Palindrome
  //Time Complexity :O(n)
  //Space Complexity :O(1)

class ValidPalindome {
    public boolean isPalindrome(String s) {
         int left = 0;
        int right = s.length() - 1;
        boolean isPalindrome = true;

        while (left < right && isPalindrome) {

            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

          
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            if (Character.toLowerCase(s.charAt(left)) 
                != Character.toLowerCase(s.charAt(right))) {
                isPalindrome = false;
            }

            left++;
            right--;
        }

        return isPalindrome;

            }
}
