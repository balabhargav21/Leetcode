class Solution {
    public int mySqrt(int x) {
        //for x is 0 and 1 case:
        if(x == 0 || x == 1){
            return x;
        }
        int start =1;
        int end = x;
        int mid = -1;
        while( start <= end){
            // Calculate mid element
            mid = start + (end - start) / 2;
            if(mid * mid == x){
                return mid;
            }
            if( (long) mid * mid > (long) x){
                end = mid - 1;
            } else{
                start = mid + 1;
            }
        }
        return Math.round(end);
    }
}