class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] matrix = new int[rows * cols][2];
        int increment = 1;
        int step = 0;
        int total = rows * cols;
        int directionIndex = 0;
        int[] directions = {0, 1, 0, -1, 0};
        matrix[step++] = new int[]{rStart, cStart};

        while (step < total) {
            for (int k = 0; k < 2; k++) {
                for (int i = 0; i < increment; i++) {
                    rStart += directions[directionIndex];
                    cStart += directions[directionIndex + 1];

                    if (rStart >= 0 && rStart < rows && cStart >= 0 && cStart < cols) {
                        matrix[step++] = new int[]{rStart, cStart};
                    }
                }
                directionIndex = (directionIndex + 1) % 4;
            }
            increment++;
        }
        return matrix;
    }
}