class Solution {
    public int characterReplacement(String s, int k) {
        
       int lp = 0;
       int maxWindow = 0;
       int freq[] = new int[26];
       int maxFreq =0;

       for(int rp = 0; rp < s.length(); rp++){
            freq[s.charAt(rp) - 'A']++;
            maxFreq = Math.max(maxFreq, freq[s.charAt(rp) - 'A']);

            int windowLength = rp-lp+1;
            if(windowLength - maxFreq > k){
                freq[s.charAt(lp)-'A']--;
                lp++;
            }
            windowLength = rp-lp+1;
            maxWindow = Math.max(maxWindow, windowLength);
       }
       return maxWindow;
    }
}
