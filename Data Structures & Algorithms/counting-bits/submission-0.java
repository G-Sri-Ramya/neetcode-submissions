class Solution {
    public int[] countBits(int n) {
        if(n == 0) return new int[]{0};
        int []ans = new int[n+1];
        ans[0] = 0;
        for(int i=1;i<=n;i++){
            int j = i;
            int c = 0;
            while(j!=0){
                c += j%2;
                j = j>>1;
            }
            ans[i] = c;
        }
        return ans;
    }
}
