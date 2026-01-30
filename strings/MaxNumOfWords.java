Leetcode question :2114. Maximum Number of Words Found in Sentences
  //Time complexity = O(n^2)
 // Space complexity = O(1)
class MaxNumOfWords {

    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for(int i = 0;i <sentences.length;i++){

            
            int count = 1;
            for(int j = 0; j <sentences[i].length();j++){
                if((sentences[i]).charAt(j) == ' '){
                count++;}

            }
            if(count>max){
            max = count;
        }
        }
        return max;
        
    }
};
