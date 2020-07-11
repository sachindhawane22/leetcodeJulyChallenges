class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> out = new ArrayList<List<Integer>>();
        long power_of_nums =  (long)Math.pow(2, nums.length); 
        int length = nums.length;
        int counter, j; 
      /*
      000, []
      001, [1]
      010, [2]
      011, [1,2]
      100, [3]
      101, [1,3]
      110, [2,3]
      111  [1,2,3]
      */
        for(counter = 0; counter < power_of_nums; counter++) 
        { 
            List<Integer> sub = new ArrayList<Integer>();
            for(j = 0; j < length; j++) 
            { 
                if((counter & (1 << j)) > 0) {
                    sub.add(nums[j]);
                }
            }        
            out.add(sub);
        }
        return out;
    } 
    
}
