LeetCode 1572: Matrix Diagnol Sum
  // Time Complexity : O(n)
  // Space Complexity : O(1)

  Optimized Code: 
class MatrixDiagnolSum {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;
        for(int i =0; i < n;i++){
            sum+= mat[i][i];
            if(i!= n-1-i){
                sum += mat[i][n-1-i];
            }
        }
        return sum;
        
    }
}
  
