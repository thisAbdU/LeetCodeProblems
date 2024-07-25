class Solution:
    def setZeroes(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        rows, cols = len(matrix), len(matrix[0])
        rows_to_zero = set()
        cols_to_zero = set()

        for i in range(rows):
            for j in range(cols):
                if matrix[i][j] == 0:
                    rows_to_zero.add(i)
                    cols_to_zero.add(j)


        for i in rows_to_zero:
            for j in range(cols):
                matrix[i][j] = 0

        for j in cols_to_zero:
            for i in range(rows):
                matrix[i][j] = 0
