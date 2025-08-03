// Last updated: 4/8/2025, 12:06:14 am
public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 1;
        int last = n;
        while(start<=last){
            int mid = start + ((last - start)>>1);
            if(isBadVersion(mid)){
                last = mid-1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}