class Solution {
    public boolean hasDuplicate(int[] nums) {
        // hashmap lookup o(1) and algo time complexity o(n)
        // HashMap<Integer, Integer> dupsMap =  new HashMap();

        // for (int i = 0; i < nums.length; i++){

        //     if(dupsMap.containsKey(nums[i])) {
        //         return true;
        //     }
        //     dupsMap.put(nums[i], 0);
        // }
        // return false;

        //  simpler approach
        // hashset lookup o(1) and algo time complexity o(n)

        HashSet<Integer> seen = new HashSet();

        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            } 
            seen.add(num);
         
        }
           return false;
    }
}