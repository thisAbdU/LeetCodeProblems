class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        List<Integer> newList = new ArrayList<>();
        int[][] reshapedArray = new int[r][c];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                newList.add(mat[i][j]);
            }
        }

        if (newList.size() != r * c) {
            return mat;
        }

        int index = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                reshapedArray[i][j] = newList.get(index);
                index++;
            }
        }return reshapedArray;
    }
}