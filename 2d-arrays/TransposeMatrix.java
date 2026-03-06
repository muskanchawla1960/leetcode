LeetCode 867: Transpose matrix
  //Time Complexity : O(n^2)
  // Space Complexity : O(n)
  class TransposeMatrix {
    public int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = new int[cols][rows];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                result[j][i]=matrix[i][j];
            }
        

        }
            return result;
    }
}
