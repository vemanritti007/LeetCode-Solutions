class Solution {
    public String shortestPalindrome(String s) {
        String rev = new StringBuilder(s).reverse().toString();
        String str = s+"#"+rev;
        int i=1,len=0;
        int lps[] = new int[str.length()];
        while(i<str.length()){
            if(str.charAt(i)==str.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }
            else if(len>0)len=lps[len-1];
            else{
                lps[i]=0;
                i++;
            }
        }
        String rem = s.substring(lps[str.length()-1]);
        return new StringBuilder(rem).reverse().toString()+s;
    }
}