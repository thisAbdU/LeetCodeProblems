class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        // Create boolean arrays to mark rows and columns to be zeroed
        boolean[] zeroRows = new boolean[rows];
        boolean[] zeroCols = new boolean[cols];
        
        // Scan the matrix and mark the corresponding rows and columns
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    zeroRows[i] = true;
                    zeroCols[j] = true;
                }
            }
        }
        
        // Zero out rows
        for (int i = 0; i < rows; i++) {
            if (zeroRows[i]) {
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = 0;
                }
            }
        }
        
        // Zero out columns
        for (int j = 0; j < cols; j++) {
            if (zeroCols[j]) {
                for (int i = 0; i < rows; i++) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
