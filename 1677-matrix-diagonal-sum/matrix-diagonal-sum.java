class Solution {
    public int diagonalSum(int[][] mat) {
        int sum =0;
        int n = mat.length;
        if ( n % 2 != 0) {
         for(int i =0; i < mat.length; i++){
            sum += mat[i][i] + mat[i][n -i -1];
         }
          return sum - mat[n/2][n/2];
       } 
      
       else{
          for(int i =0; i<n; i++){
            sum += mat[i][i] + mat[i][n - i - 1];
          }
       }
       return sum;
      
  
  
  
  
    }
}