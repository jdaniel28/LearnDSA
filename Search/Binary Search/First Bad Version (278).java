/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
     int low = 1;
    int high = n;
        int res = n;
        while(low <= high){
            // float temp = (float)(high)/2 + (float)(low)/2;
            int half = low + (high - low)/2;
            boolean badV = isBadVersion(half);
            if(badV){
                res = half;
                high =half -1;
            }else{
                low = half + 1;
            }
        }
    return res;
    }
}