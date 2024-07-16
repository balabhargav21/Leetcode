class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        //Create a arraylist 
        ArrayList<Integer> arr = new ArrayList<>();
        //the approach is we need to fill the list in the order.
        //the order is we need to fill list the list by taking the indices of index[] and store 
        //the value of nums as per indicens of index[] array
        //store the value in list 
         for(int i =0; i < nums.length; i++){
            //storing the value of nums by indices of index array in the list
            arr.add(index[i], nums[i]);
         }
         //we need to return as array so loop through list and added into the target array

         int[] target = new int[nums.length];
          for(int i=0; i<nums.length; i++){
            target[i] = arr.get(i);
          } 
       return target;
    }
}