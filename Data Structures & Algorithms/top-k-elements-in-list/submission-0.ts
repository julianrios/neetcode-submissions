class Solution {
    /**
     * @param {number[]} nums
     * @param {number} k
     * @return {number[]}
     */
    topKFrequent(nums: number[], k: number): number[] {
        let freqMap: Map<number, number> = new Map();

        // Step 1: Build frequency map
        for (const num of nums) {
            if (!freqMap.has(num)) {
                freqMap.set(num, 1);
            } else {
                freqMap.set(num, freqMap.get(num)! + 1);
            }
        }

        // Step 2: Create buckets (array of lists)
        const buckets: number[][] = Array(nums.length + 1)
            .fill(0)
            .map(() => []);

        // Step 3: Fill buckets using the frequency map
        for(const [num, freq] of freqMap.entries()) {
            buckets[freq].push(num);
        }

        // Step 4: Collect the top k frequent elements
        const result: number[] = [];

        for(let i = buckets.length - 1; i>=0 && result.length < k; i--){
            if(buckets[i].length > 0) {
                result.push(...buckets[i]);
            }
        }

        return result.slice(0, k);
    }
}
