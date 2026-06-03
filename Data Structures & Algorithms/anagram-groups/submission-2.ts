class Solution {
    /**
     * @param {string[]} strs
     * @return {string[][]}
     */
    groupAnagrams(strs: string[]): string[][] {
        let anagramMap: Map<string, string[]> = new Map();

        for(const word of strs) {
            const sortedKey = word.split("").sort().join("");
            if(!anagramMap.has(sortedKey)) {
                anagramMap.set(sortedKey, []);
            }

            anagramMap.get(sortedKey).push(word);
        }
        return Array.from(anagramMap.values());
    }
}
