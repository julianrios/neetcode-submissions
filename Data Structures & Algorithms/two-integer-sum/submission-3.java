class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> indicesMap = new HashMap<>();

        for(int i=0; i < nums.length; i++) {
            int diff = target - nums[i];

            if (indicesMap.containsKey(diff)) {
                return new int[]{indicesMap.get(diff), i};
            }
            indicesMap.put(nums[i], i);
        }
    
        return new int[]{};
    }
}
