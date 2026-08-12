class Solution {
    public static int value(char ch)
    {
        switch(ch){
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
        int len = s.length();
        int ans=0;
        for(int i=0;i<len;i++)
        {
            char curr = s.charAt(i);
            if(i<len-1 && value(curr)<value(s.charAt(i+1))) {
            ans-=value(curr);
            }
            else{
            ans+=value(curr);
            }
        }
        return ans;
    }
}