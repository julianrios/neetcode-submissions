class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> groupedMap = new HashMap<>();

        for(String word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            groupedMap.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
        }

        return new ArrayList<>(groupedMap.values());
    }
}
