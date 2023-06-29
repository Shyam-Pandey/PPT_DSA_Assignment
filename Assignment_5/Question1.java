//Convert 1D array to 2D array.
public class Question1 {
    public int[][] construct2DArray(int[] original, int m, int n) {

        int res[][] = new int[m][n];
        int r [][] = {};
        int k = 0 ;

        if(m*n!=original.length)
         return r;
        for(int i = 0; i < m ; i++){
            for(int j = 0; j < n ; j++){
                res[i][j] = original[k];
                k++;
            }
        } 
        return res;
    }
}