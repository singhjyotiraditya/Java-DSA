class Solution {
    public void rotate(int[][] matrix) {
        for (int row = 0; row<matrix.length; row++){
            for (int column = row; column<matrix[0].length; column++){
               if(row != column) {
                 int temp = matrix[row][column];
                 matrix[row][column] = matrix[column][row];
                 matrix[column][row] = temp;
              }
            }
        }

        for (int row = 0; row<matrix.length; row++){
            for (int column = 0; column < matrix.length/2; column++){
                 int temp = matrix[row][column];
                 matrix[row][column] = matrix[row][matrix.length-1-column];
                 matrix[row][matrix.length-1-column] = temp;
            }
        }

    }
}