Leetcode 1221 : Split a string in balanced strings
  //Time Complexity :O(n)
  //Space Complexity : O(1)


class SplitToBalStrings {
    public int balancedStringSplit(String s) {
        int bal = 0;
        int count = 0;
        for(int i = 0; i< s.length(); i++){
            if(s.charAt(i) == 'L'){
                bal++;
            }else{
                bal--;
            }
            if(bal ==0){
                count++;
            }
        }
        return count;
        
    }
}
