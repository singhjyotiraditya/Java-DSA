class Solution {
    public int[][] transpose(int[][] matrix) {
        int[][] transpose = new int[matrix[0].length][matrix.length];

        for (int row=0; row < matrix.length; row++){
            for (int column=0; column< matrix[row].length; column++){
                transpose[column][row] = matrix[row][column];
            }
        }

        return transpose;
        
    }
}