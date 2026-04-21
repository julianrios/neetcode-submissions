class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> seenSet = new HashSet<>();

        for(Integer num : nums) {
            if(seenSet.contains(num)) {
                return true;
            }
            seenSet.add(num);
            
        }
        return false;


    }
}