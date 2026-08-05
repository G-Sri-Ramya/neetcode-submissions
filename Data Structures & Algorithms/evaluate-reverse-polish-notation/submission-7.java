class Solution {
    public boolean check(String ch){
        if(ch.isEmpty()) return false;
        try{
            int n = Integer.parseInt(ch);
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(String ch : tokens){
                if(check(ch))
                st.push(Integer.parseInt(ch));
            
            else{
                if(st.size() < 2) return -1;
                int a = st.pop();
                int b = st.pop();
                if(ch.equals("+")) st.push(a+b);
                if(ch.equals("-")) st.push(b-a);
                if(ch.equals("*")) st.push(a*b);
                if(ch.equals("/")) {
                    if(a == 0) return -1;
                    st.push(b/a);
                }
            }
        }
        if(st.isEmpty()) return -1;
        return st.pop();
    }
}
