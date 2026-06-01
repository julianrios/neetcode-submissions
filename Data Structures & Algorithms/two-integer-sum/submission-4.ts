class Solution {
    /**
     * @param {number[]} nums
     * @param {number} target
     * @return {number[]}
     */
    twoSum(nums: number[], target: number): number[] {
        // Brute force nested loop 
        // for(let i=0; i< nums.length; i++) {
        //     for (let j=i+1; j < nums.length; j++) {
        //         if(nums[i] + nums[j] === target){
        //             return [i, j];
        //         }
        //     }
        // }
        // return [];

        const lookupMap: Map<number, number> = new Map();
        for(let i=0; i< nums.length; i++) {
            const complement = target - nums[i];
            
            if(lookupMap.has(complement)) {
                return [i, lookupMap.get(complement)!];
            } 

            lookupMap.set(nums[i], i);
        }
        return [];
    }
}
