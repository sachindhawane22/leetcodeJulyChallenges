class Solution {
    public int arrangeCoins(int n) {
        int j=0;
        int orig = n;
        for(int i=1 ; i<=orig ; i++){
            n = n-i;
            j++;
            if(n < 0){
                return j-1;
            }
        }
        return j;
    }
}
