class NumMatrix {
    private int[][] sumArray;
    
    public NumMatrix(int[][] matrix) {
       this.sumArray = new int[matrix.length + 1][matrix[0].length + 1];
        
        for(int i = 0; i < matrix.length; i++){
            int sum = 0;
            for(int j = 0; j < matrix[i].length; j++){
                int prefix = sumArray[i][j + 1]; 
                sum += matrix[i][j];
                sumArray[i + 1][j + 1] = sum + prefix;
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int bottomRight = sumArray[row2 + 1][col2 + 1];
        int left = sumArray[row2 + 1][col1];
        int above = sumArray[row1][col2 + 1];
        int topLeft = sumArray[row1][col1];
        
        return bottomRight - left - above + topLeft;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */