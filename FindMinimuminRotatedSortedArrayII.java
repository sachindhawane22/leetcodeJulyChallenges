public class Solution {
    public int findMin(int[] num) {
        if(num == null || num.length == 0) {
            return -1; // should throw an exception, not sure if leetcode supports it
        }
        int l = 0;
        int r = num.length-1;
        while(l < r) {
            if(num[l] < num[r]) {
                return num[l];
            }
            int m = l + (r-l)/2;
            if(num[l] > num[m]) {
                r = m;
            } else if(num[l] < num[m]) {
                l = m+1;
            } else { // num[l] == num[m]
                if(num[l] == num[r]) {
                    l++;
                    r--;
                } else { // only the num[l] == num[m] >  num[r] case left
                    l = m+1;
                }
            }
        }
        return num[l];
    }
}
