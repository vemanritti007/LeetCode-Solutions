class Solution {
    public static int[] build(String p){
        int[] lps = new int[p.length()];
        int len=0,i=1;
        lps[0]=0;
        while(i<p.length()){
            if(p.charAt(i)==p.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }
            else if(len>0){
                len=lps[len-1];
            }
            else{
                lps[i]=0;
                i++;
            }
        }
        return lps;
    }
    public int strStr(String haystack, String needle) {
        int lps[] = build(needle);
        int i=0,j=0;
        while(i<haystack.length()){
            if(haystack.charAt(i)==needle.charAt(j)){
                i++;
                j++;
                if(j==needle.length())return i-j;
            }
            else if(j>0)j=lps[j-1];
            else i++;
        }
        return -1;
    }
}