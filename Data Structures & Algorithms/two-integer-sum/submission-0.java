class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> needs = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int needed = target - nums[i];

            if(needs.containsKey(needed)){
                return new int[]{needs.get(needed),i};
            }

            needs.put(nums[i],i);
        }
        
        return new int[]{};
    }
}
