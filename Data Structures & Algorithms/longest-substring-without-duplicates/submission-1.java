class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        if(s.length() == 0) return 0;
        int lp = 0;
        int out = 1;
        Set<Character> set = new HashSet<>();

        for(int rp = 0; rp < s.length(); rp++){
            while(set.contains(s.charAt(rp))){
                set.remove(s.charAt(lp));
                lp++;
            }
            set.add(s.charAt(rp));
            out = Math.max(out, rp - lp +1);
        }
        return out;
    }
}
