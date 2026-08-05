class Solution {
    public int[] productExceptSelf(int[] nums) {
        int l = nums.length;
        int ans[] = new int[nums.length];
        int pre[] = new int[nums.length];
        int pos[] = new int[nums.length];
        pre[0] = nums[0];
        pos[l-1] = nums[l-1];
        for(int i=1;i<l;i++){
            pre[i] = pre[i-1] * nums[i];
        }
        for(int j=l-2;j>=0;j--){
            pos[j] = pos[j+1] * nums[j];
        }
        ans[0] = pos[1];
        ans[l-1] = pre[l-2];
        for(int i=1;i<l-1;i++){
            ans[i] = pre[i-1] * pos[i+1];
        }
        return ans;
    }
}  
