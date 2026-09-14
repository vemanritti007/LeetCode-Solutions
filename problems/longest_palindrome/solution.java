class Solution {

    public int longestPalindrome(String s) {

        int freq[] = new int[52];

        int len = 0;
        int maxOdd = 0;

        for(char c : s.toCharArray()) {

            if(c >= 'a' && c <= 'z') {
                freq[c - 'a']++;
            }
            else {
                freq[c - 'A' + 26]++;
            }
        }

        for(int i = 0; i < 52; i++) {

            if(freq[i] % 2 == 0) {
                len += freq[i];
            }
            else {
                len += freq[i] - 1;
                maxOdd = 1;
            }
        }

        return len + maxOdd;
    }
}