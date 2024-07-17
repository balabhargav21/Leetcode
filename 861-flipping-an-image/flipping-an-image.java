class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image[0].length;
        int[][] result = new int[n][n];
        for(int i=0 ; i < n; i++){
            for(int j=0; j<n; j++){
                result[i][j] = image[i][n-j-1];
            }
        }
        for(int i=0; i <n; i++){
            for(int j=0; j<n; j++){
             result[i][j] = result[i][j] == 1 ? 0 : 1;
            
            }
        }
        return result;
    }
}