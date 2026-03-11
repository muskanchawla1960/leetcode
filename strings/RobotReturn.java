Leetcode 657: Robot Return to Origin
  // Time Complexity : O(n)
  // Space Complexity :O(1)
  class RobotReturn{
    public boolean judgeCircle(String moves) {
        int x = 0;
        int y= 0;
        for(int i = 0; i < moves.length(); i++){
            char move = moves.charAt(i);
            if(move == 'R'){
                x++;
            }else if(move == 'L'){
                x--;
            }
            else if (move == 'U'){
                y++;
            }else{
                y--;
            }
            

        }return x == 0 && y==0;
        
    }
}
