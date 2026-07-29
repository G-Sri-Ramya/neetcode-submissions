class Solution {
    public boolean isPalindrome(String s) {
        String x = "";
        for(char ch : s.toCharArray()){
            if((ch>='A' && ch <='Z') || (ch>='a' && ch<='z') || (ch>='0' && ch<='9'))
            x+=ch;
        }
        x = x.toLowerCase();
        int l = x.length();
        int i = 0, j = l-1;
        while(i<=j){
            if(x.charAt(i) != x.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
