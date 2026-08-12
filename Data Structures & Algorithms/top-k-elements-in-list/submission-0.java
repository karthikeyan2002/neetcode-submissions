class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> fMap = new HashMap<>();

        for(int num:nums){
            fMap.put(num,fMap.getOrDefault(num,0)+1);
        }

        List<Map.Entry<Integer,Integer>> entries = new ArrayList<>(fMap.entrySet());

        entries.sort((a,b)->b.getValue()-a.getValue());

        int[] result = new int[k];
        for(int i=0;i<k;i++){
            result[i] = entries.get(i).getKey();
        }

        return result;
    }
}
