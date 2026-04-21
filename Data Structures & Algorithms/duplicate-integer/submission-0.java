class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        HashMap<Integer, Integer> dupsMap =  new HashMap();

        for (int i = 0; i < nums.length; i++){

            if(dupsMap.containsKey(nums[i])) {
                return true;
            }
            dupsMap.put(nums[i], 0);
        }
        return false;
    }
}