class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
         //Storing the values of mat matrix
        //i.e m = rows & n = cols
        int rows = mat.length;
        int cols = mat[0].length;
        //checking the product of ros and cols of mat and the new matrix is not same
        // then we return mat(original)
        if((rows * cols) != (r * c))
          return mat;
        //creating new matrix
        int[][] reshape= new int[r][c];
        int re_rows=0;
        int re_cols=0;
        for(int i=0; i< rows; i++){
            for(int j=0; j< cols; j++){
                reshape[re_rows][re_cols] = mat[i][j];
                re_cols++;
        //if the cols value reached then change the row and set the cols value to 0.
             if(re_cols == c){
                 re_cols = 0;
                 re_rows++;
             }            
             
            }
        }
        return reshape;

    }
}