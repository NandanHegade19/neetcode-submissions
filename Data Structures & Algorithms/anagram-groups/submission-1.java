class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> result = new HashMap<>();

        for(String word : strs){
            int[] count = new int[26];

            for(char c : word.toCharArray()){
                count[c-'a']++;
            }

            String key = Arrays.toString(count);

            result.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
        }

        return new ArrayList<>(result.values());
    }
}
