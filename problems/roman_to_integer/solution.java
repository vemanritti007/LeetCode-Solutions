class Solution {
    public static int value(char c){
        switch(c){
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
            default : return 0;      
        }
    }
    public int romanToInt(String s) {
        int ans=0,n=s.length();
        for(int i=0;i<n;i++){
            char curr = s.charAt(i);
            int val = value(curr);
            if(i<n-1 && val < value(s.charAt(i+1))){
                ans-=val;
            }
            else{
                ans+=val;
            }
        }
        return ans;
    }
}