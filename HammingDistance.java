class Solution {
    /*public int hammingDistance(int x, int y) {
        String xBin = Integer.toBinaryString(x);
        String yBin = Integer.toBinaryString(y);
        StringBuilder xb = new StringBuilder(xBin);
        StringBuilder yb = new StringBuilder(yBin);
        int distance =0;

        if(xBin.length() < yBin.length()){
            while(xb.length() != yb.length()){
                xb.insert(0,"0");
            }
            //xb = xb.reverse();
            System.out.println(xb +" "+ yb);
        }else if(xBin.length() > yBin.length()){
            while(yb.length() != xb.length()){
                yb.insert(0,"0");
            }
            //yb = yb.reverse();
            System.out.println(xb +" "+ yb);
        }
        for(int i = 0; i < xb.length() ; i++){
                if(xb.charAt(i) != yb.charAt(i)){
                    distance ++;
                }
        }
        return distance;

    }*/
    
    
    /*
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }
    
    */

    public int hammingDistance(int x, int y) {
        String str = Integer.toBinaryString(x^y);
        return str.replace("0","").length();
    }
}
