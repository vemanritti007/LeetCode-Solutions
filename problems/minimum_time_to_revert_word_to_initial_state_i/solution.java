class Solution {
    public int minimumTimeToInitialState(String word, int k) {
        int n = word.length();
        int time = 1;

       
        for (int i = k; i < n; i += k) {
            
            if (word.startsWith(word.substring(i))) {
                return time;
            }
            time++;
        }

        return time;
    }
}