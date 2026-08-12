class Solution {
    public boolean isPalindrome(String s) {
        
        String str = s.toLowerCase();
        str = str.replace(" ", "");
        str = str.replaceAll("[^a-zA-Z0-9]", "");

        int lp = 0;
        int rp = str.length()-1;

        for(int i = 0; i < str.length()/2; i++){
            if(str.charAt(lp) == str.charAt(rp)){
                lp++;
                rp--;
            } else return false;
        }
        return true;

    }
}
