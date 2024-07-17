class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] zero = new int[m][n];
        for(int i =0; i < indices.length; i++){
            int ri = indices[i][0];
            for(int j=0; j <n; j++){
                zero[ri][j]++;
            } 
            int ci = indices[i][1];
            for(int j=0; j<m; j++){
                zero[j][ci]++;
            }
       }
       int oddCount =0;
       for(int i=0; i<m; i++){
        for(int j=0; j<n; j++){
            if(zero[i][j] % 2 != 0){
                oddCount++;
            }
        }
    }

      return oddCount;
    }
}