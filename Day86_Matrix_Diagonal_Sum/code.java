class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = mat.length - 1; j >= 0; j--) {
                if (i == j) {
                    sum += mat[i][j];
                } else if ((i + j) == mat.length - 1) {
                    sum += mat[i][j];
                }
            }
        }
        return sum;
    }
}