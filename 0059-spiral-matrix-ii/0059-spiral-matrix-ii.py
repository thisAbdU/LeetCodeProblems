class Solution:
    def generateMatrix(self, n: int) -> list[list[int]]:
        generatedMatrix = [[0] * n for _ in range(n)]
        left, right = 0, n - 1
        top, bottom = 0, n - 1
        value = 1

        while(left <= right or top <= bottom):
            for column in range(left, right + 1):
                generatedMatrix[top][column] = value
                value += 1
            top += 1

            for row in range(top, bottom + 1):
                generatedMatrix[row][right] = value
                value += 1
            right -= 1

            for column in range(right, left - 1, -1):
                generatedMatrix[bottom][column] = value
                value += 1
            bottom -= 1

            for row in range(bottom, top -1, -1):
                generatedMatrix[row][left] = value
                value += 1
            left += 1
        return generatedMatrix
        