class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        List<Integer> r = new ArrayList<>();

        while (startRow <= endRow && startCol <= endCol) {

            for (int j = startCol; j <= endCol; j++) {
                r.add(matrix[startRow][j]);
            }
            for (int i = startRow + 1; i <= endRow; i++) {
                r.add(matrix[i][endCol]);
            }
            if (startRow < endRow) {
                for (int j = endCol - 1; j >= startCol; j--) {
                    r.add(matrix[endRow][j]);
                }
            }
            if (startCol < endCol) {
                for (int i = endRow - 1; i > startRow; i--) {
                    r.add(matrix[i][startCol]);
                }
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        return r;
    }
}


