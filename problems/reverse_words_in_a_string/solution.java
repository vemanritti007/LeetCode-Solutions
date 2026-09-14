class Solution {
    public String reverseWords(String s) {
        String s1 = s.trim();
        Stack<String> st = new Stack<>();
        StringBuilder curr = new StringBuilder();
        for(int i=0;i<s1.length();i++){
            char ch = s1.charAt(i);
            if(ch != ' '){
                curr.append(ch);
            }
            else{
                if(curr.length()>0){
                    st.push(curr.toString());
                    curr.setLength(0);
                    st.push(" ");
                }
            }
        }
        if(curr.length()>0){
            st.push(curr.toString());
        }
        curr.setLength(0);
        while(!st.isEmpty()){
            curr.append(st.pop());
        }
        return curr.toString();
    }
}