class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {

      ArrayList<Integer> result = new ArrayList<>();
      for(int i = num.length - 1; i >= 0; i-- ){
         result.add(0, (num[i] + k ) % 10);
         k = (num[i] + k )/ 10;
      }
      while( k > 0){
        result.add(0, k % 10);
        k = k / 10;
      }
      return result;








        /* BRUTE FORCE APPROACH THE FIRST SOLUTION in mind 
         
       int number = 0;
       //At first we have to convert the array into number [1,2,3,4] => 1234

        for(int i=0; i< num.length; i++){
            number = number * 10 + num[i];
        }
        //After converting the array as number do number + k
        int numForm = number + k;
        //we need to return as list so create list 
       ArrayList<Integer> result = new ArrayList<>();
       //After adding k to the number add to list
          while(numForm > 0){
            int rem = numForm % 10;
            result.add(rem);
            numForm = numForm / 10;
          }
          //ex--1234 will appear as 4321
          //the resultant list is in the reverse order we need to reverse it
          //reversing arraylist using below method
       Collections.reverse(result);
       return result;
        */
    }
}