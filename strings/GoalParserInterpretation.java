Leetcode 1678 Strings : Goal Parser Interpretation
//Time Complexity : O(n)
//Space Complexity : O(n)
  class GoalParserInterpretation{
    public String interpret(String command) {
        String  result = "";
        for(int i = 0; i < command.length();i++){
            if(command.charAt(i) == '(' && command.charAt(i+1) == ')'){
                result = result + "o" ;
                i=i+1;
            }else if(command.charAt(i) == '(' && command.charAt(i+3) == ')'){
                result = result +"al";
                i=i+3;
            }else{
                result = result + command.charAt(i);
            }
        }
        return result;
        
    }
}
