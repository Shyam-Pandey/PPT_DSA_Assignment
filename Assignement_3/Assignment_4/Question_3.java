package Assignement_3.Assignment_4;

public class Question_3 {
    public int[][] transpose(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int transposeMatrix[][] = new int[n][m];

        for(int r = 0 ;r<m ; r++){
            for(int c = 0 ;c<n ; c++){
                transposeMatrix[c][r] = matrix[r][c];
            }
        }
        return transposeMatrix;
    
    }
}
