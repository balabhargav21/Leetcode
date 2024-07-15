class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr= new int [n * 2];
        int l=n;
        for (int i=0 ; i<l; i++){
            arr[i + i]=nums[i];
            arr[i+i+1] =nums[n++];
        }
        return arr;
        
    }
}