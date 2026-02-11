Leetcode 1684 - Count the Number of Consistent Strings
 // Time Complexity : O(n^2)
  //Space Complexity : O(1)
  class ConsistentStrings {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        for(int i = 0; i < words.length;i++){
            boolean isCons = true;
            for(int j = 0; j < words[i].length();j++){
                if(!allowed.contains(words[i].charAt(j) + "")){
                    isCons = false;
                }
            }
            if(isCons){
                count++;
            }
           
        }

        return count; 
    } 
   
}
  
