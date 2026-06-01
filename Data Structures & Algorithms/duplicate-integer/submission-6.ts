class Solution {
    /**
     * @param {number[]} nums
     * @return {boolean}
     */
    hasDuplicate(nums: number[]): boolean {
        
        // for (let i = 0; i < nums.length; i++) {
        //     for(let j = i+1; j < nums.length; j++) {
        //         if(nums[i]==nums[j]) {
        //             return true;
        //         }
        //     }
        // }
        // return false;

        // convert array to a set then check the size

        let noDupSet = new Set(nums);

        return noDupSet.size !== nums.length;
    }
}
