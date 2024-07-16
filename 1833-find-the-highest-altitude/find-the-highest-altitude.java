class Solution {
    public int largestAltitude(int[] gain) {
        //initially the altitude is 0,
        //here max represents the highest altitude 
        //here alt represents the current altitude 
      int max =0;
      int alt =0;
     for(int i=0; i < gain.length; i++){
        //current position is 0 and next point is -5 
        //my cuurent alt is 0 + (-5);
        //alt calculates the altitude and we need to return the highAltitude 
        //we compare the alt and max
        
        alt = gain[i] + alt;
        max = Math.max(alt,max);
         
     }
     return max;
    }
}