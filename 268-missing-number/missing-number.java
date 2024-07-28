class Solution {
    public int missingNumber(int[] nums) {
        int i =0; 
        while( i < nums.length ){
            int crct = nums[i];
            if(nums[i] < nums.length && nums[i] != nums[crct]){
                swap(nums, i, crct);
            }else{
                i++;
            }
        }
        for(int idx =0; idx < nums.length; idx++){
            if(nums[idx] != idx){
                return idx;
            }
        }
         return nums.length;
    }
    public void swap(int[] arr, int f, int s){
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp; 
    }
}