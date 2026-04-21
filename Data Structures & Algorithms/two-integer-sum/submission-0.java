class Solution {
    public int[] twoSum(int[] nums, int target) {
// 1. Restate problem
// 2. Describe brute force
// 3. Identify bottleneck
// 4. Introduce data structure
// 5. Explain complexity

    // brute force approach
    // two loops one nested loop
    // first loop to gets first index 
    // second loop to grab second index
    // validate if the two indexes equal the target
    // if so return the indices else continue looping
    // time complexity is o(n^2) comparing each element with every other element



    for (int i = 0; i < nums.length; i++) {
        for (int j = i + 1; j < nums.length; j++) {
            int sum = nums[i] + nums[j];
            if (sum == target) {
                return new int[]{i, j};
            } 
        }
    }
    return new int[0];

    }
}
