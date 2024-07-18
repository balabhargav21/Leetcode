class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
           
      for(int i =0; i<4; i++){
         if(check(mat, target))
           return true;
          rotate(mat);  
     }
     return false;
     
    }
    boolean check(int[][] mat, int[][] target){
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat.length; j++){
                if(mat[i][j] != target[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
     public void rotate(int[][] mat){
        // first we transpose the mat 
        transpose(mat);
        for(int i=0; i< mat.length; i++){
            int start=0, end=mat.length-1;
            while(start <= end){
                 int temp = mat[i][start];
                mat[i][start] = mat[i][end];
                mat[i][end] = temp;
                start++;
                end--;
            }
        }

    }
    public void transpose(int[][] mat){
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<i; j++){
                int temp=mat[i][j];
                mat[i][j] = mat[j][i];
                 mat[j][i] = temp;
            }
        }
    }
}