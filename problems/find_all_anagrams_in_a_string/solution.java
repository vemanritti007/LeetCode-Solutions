class Solution {

    public static boolean compare(int a[], int b[]) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i])
                return false;
        }
        return true;
    }

    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> ans = new ArrayList<>();

        if (p.length() > s.length())
            return ans;

        int freq[] = new int[26];

        for (int i = 0; i < p.length(); i++) {
            freq[p.charAt(i) - 'a']++;
        }

        int n = p.length();
        int window[] = new int[26];

        for (int i = 0; i < n; i++) {
            window[s.charAt(i) - 'a']++;
        }

        if (compare(freq, window))
            ans.add(0);

        int right = n;

        while (right < s.length()) {

            window[s.charAt(right) - 'a']++;
            window[s.charAt(right - n) - 'a']--;

            if (compare(freq, window))
                ans.add(right - n + 1);

            right++;
        }

        return ans;
    }
}