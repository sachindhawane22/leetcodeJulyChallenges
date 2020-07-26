class Solution {
    public String addBinary(String a, String b) {
        /*int int1=Integer.parseInt(a,2);
        int int2=Integer.parseInt(b,2);
        int sum = int1+int2;
        String ret = Integer.toBinaryString(sum);
        return ret;*/
        int c = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0;){
            if(i >= 0) c += a.charAt(i--) - '0';
            if(j >= 0) c += b.charAt(j--) - '0';
            sb.insert(0, (char)((c % 2) + '0'));
            c /= 2;
        }
        if(c == 1) sb.insert(0, "1");
        return sb.toString();
    
    }
}
