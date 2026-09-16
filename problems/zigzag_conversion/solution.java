class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1 || numRows>=s.length())return s;
        StringBuilder sb = new StringBuilder(s.length());
        int cycle = (2*(numRows-1));
        for(int i=0;i<numRows;i++){
            for(int j=i;j<s.length();j+=cycle){
                sb.append(s.charAt(j));
                if(i>0 && i<numRows-1 && j+cycle-(2*i)<s.length()){
                    sb.append(s.charAt(j+cycle-(2*i)));
                }
            }
        }
        return sb.toString();
    }
}