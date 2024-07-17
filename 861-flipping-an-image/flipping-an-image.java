class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image[0].length;
        int[][] result = new int[n][n];
        //step 1 : we need reverse the each row horizontally in the given matrix
        for(int i=0 ; i < n; i++){
            for(int j=0; j<n; j++){
                result[i][j] = image[i][n-j-1];
            }
        }
        //after reversing each row we need to invert the result matrix
        //it means replace 1 with 0 , 0 with 1
        for(int i=0; i <n; i++){
            for(int j=0; j<n; j++){
             result[i][j] = result[i][j] == 1 ? 0 : 1;
            
            }
        }
        return result;
    }
}