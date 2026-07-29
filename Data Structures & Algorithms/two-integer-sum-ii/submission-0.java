class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for(int i=0;i<numbers.length-1;i++){
            int x = target - numbers[i];
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[j] == x){
                    return new int[]{i+1,j+1};
                }
            }
        }
        return new int[0];
    }
}
