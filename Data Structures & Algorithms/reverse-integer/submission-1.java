class Solution {
    public int reverse(int x) {
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        if(x == 0) return 0;
        int n = Math.abs(x);
        long res = 0;
        while(n!=0){
            int r = n%10;
            res = res * 10 + r;
            n/=10;
        }
        if(x < 0) res = -res;
        if(res < min || res > max) return 0;
        return (int)res;
    }
}
