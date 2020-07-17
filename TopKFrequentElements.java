class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int [] ret = new int[k];
        Map<Integer, Integer> frequencyMap = new HashMap<Integer, Integer>();
        for (int n : nums) {
            frequencyMap.put(n, frequencyMap.getOrDefault(n, 0) + 1);
        }

        Set<Map.Entry<Integer,Integer>> es = frequencyMap.entrySet();
        List<Map.Entry<Integer,Integer>> al=new ArrayList(es);
        
        Collections.sort(al,(i1,i2)->i2.getValue().compareTo(i1.getValue()));
        
        for(int i=0;i<k;i++){
            ret[i] = al.get(i).getKey();
        }

        return ret;
    }
}
