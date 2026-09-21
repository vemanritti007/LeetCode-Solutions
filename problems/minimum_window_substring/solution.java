class Solution {
    public String minWindow(String s, String t) {
        if(t.length() > s.length())return "";
        int formed =0,required=0,minLen=Integer.MAX_VALUE,minStart=0,left=0;
        int need[] = new int[128];
        int window[] = new int[128];
        for(char c : t.toCharArray()){
            if(need[c]==0)required++;
            need[c]++;
        }
        for(int right=0;right<s.length();right++){
            char rc = s.charAt(right);
            window[rc]++;
            if(need[rc]>0 && window[rc]==need[rc])formed++;
            while(formed==required){
                if(minLen>right-left+1){
                    minLen=right-left+1;
                    minStart=left;
                }
                char lc = s.charAt(left);
                window[lc]--;
                if(need[lc]>0 && window[lc]<need[lc])formed--;
                left++;
            }
        }
        return minLen==Integer.MAX_VALUE?"":s.substring(minStart,minLen+minStart);
    }
}