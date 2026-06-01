class Solution {
    /**
     * @param {string} s
     * @param {string} t
     * @return {boolean}
     */
    isAnagram(s: string, t: string): boolean {
        if (s.length !== t.length) return false;

        const freqMap: Map<string, number> = new Map();

        for(const ch of s) {
            freqMap.set(ch, (freqMap.get(ch) ?? 0) +1)
        } 

        for(const ch of t) {
            const count = freqMap.get(ch);
            if(!count) return false; // undefined or 0 
            freqMap.set(ch, count - 1)
        }       

        // for(const num of freqMap.values()) {
        //     if (num !== 0) {
        //         return false;
        //     }
        // }

        return true;       

    }
}
