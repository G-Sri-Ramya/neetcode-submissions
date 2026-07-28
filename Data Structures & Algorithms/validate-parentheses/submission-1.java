class Solution {
    public boolean check(char x, char y){
        if(x == '(' && y == ')') return true;
        if(x == '[' && y == ']') return true;
        if(x == '{' && y == '}') return true;
        return false;
    }
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '[' || ch == '{'){
                st.push(ch);
            }
            else{
                if(st.isEmpty()) return false;
                char x = st.peek();
                boolean check = check(x,ch);
                if(check) st.pop();
                else return false;
            }
        }
        return st.isEmpty();
    }
}
