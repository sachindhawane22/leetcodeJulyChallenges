public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        String str = Integer.toBinaryString(n);
        StringBuilder sb = new StringBuilder(str);
        while(sb.length() < 32){
            sb.insert(0,"0");
        }
        System.out.println(sb);
        sb = sb.reverse();
        System.out.println(sb);
        int ret = Integer.parseUnsignedInt(sb.toString(),2);  
        return ret;
        
        /*  boolean isNegative = n < 0;
        
        int reverseNumber = 0;
        
        // counter to track the number of bits in the number
        int count = 31;
        
        while(count != 0){
            //getting the last bit from the number
			// Suppose number is 5, i.e. 0000 0101, then we perform AND operation with 0000 0001,
			// so we get 0000 0001 i.e. the last bit of the number 5
            int lastBit = n & 1;
            
            // add it to the reverseNumber variable using OR operation, initially reverse number is 0
			// 0000 0000 | 0000 0001 = 0000 0001(Based on the example of number 5)
            reverseNumber = reverseNumber | lastBit;
            
            // shift one position to the left
			// After left shift, current reverse number will become : 0000 0010
            reverseNumber = reverseNumber << 1;
            
            // now right shift the number one position
			// After right shift of 5, current input number : 0000 0010
            n = n >> 1;
            
            count--;
        }// Now we repeat the process
        
        
        return isNegative?reverseNumber+1:reverseNumber;
        
        */
    }
}

