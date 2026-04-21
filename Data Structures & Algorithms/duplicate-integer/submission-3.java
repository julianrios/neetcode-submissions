class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> numsSet = new HashSet<>();

        for(Integer num : nums) {

            if(!numsSet.contains(num)) {
                numsSet.add(num);
            } else {
                return true;
            }
            
        }
        return false;


    }
}