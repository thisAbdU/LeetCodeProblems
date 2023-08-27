class Solution {
  public static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> luckyNumbers = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        
        int[] minInRow = new int[m];
        int[] maxInCol = new int[n];
        
        // Find minimum in each row
        for (int i = 0; i < m; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                min = Math.min(min, matrix[i][j]);
            }
            minInRow[i] = min;
        }
        
        // Find maximum in each column
        for (int j = 0; j < n; j++) {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < m; i++) {
                max = Math.max(max, matrix[i][j]);
            }
            maxInCol[j] = max;
        }
        
        // Check for lucky numbers
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == minInRow[i] && matrix[i][j] == maxInCol[j]) {
                    luckyNumbers.add(matrix[i][j]);
                }
            }
        }
        
        return luckyNumbers;
}
}