class Solution {
    public int findClosestNumber(int[] nums) {
       int closest = nums[0];
       for(int x:nums){
         if(Math.abs(x) < Math.abs(closest)){
            closest = x;
         }
       }
       if(closest < 0 && contains(nums,Math.abs(closest))){
        return Math.abs(closest);
       }
       else{
        return closest;
       }
    }
    public boolean contains(int[] nums, int value){
        for(int x : nums){
            if(x == value){
                return true;
            }
        }
        return false;
    }
}