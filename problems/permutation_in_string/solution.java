class Solution {
    public static boolean compare(int a[],int b[]){
        for(int i=0;i<26;i++){
            if(a[i]!=b[i]) return false;
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length())return false;
        int freq[] = new int[26];
        int window[] = new int[26];
        for(int i = 0 ; i<s1.length() ; i++){
            freq[s1.charAt(i)-'a']++;
        }
        int i=0;
        int j=s1.length();
        for(i=0;i<j;i++){
            window[s2.charAt(i)-'a']++;
        }
        if(compare(freq,window))return true;
        else{
            while(i<s2.length()){
                window[s2.charAt(i)-'a']++;
                window[s2.charAt(i-j)-'a']--;
                if(compare(window,freq))return true;
                i++;
            }
        }
        return false;
    }
}