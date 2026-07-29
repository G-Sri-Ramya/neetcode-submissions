class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int rowst = 0;
        int rowend = matrix.length-1;
        int colst = 0;
        int colend = matrix[0].length-1;
        while(rowst <= rowend && colst <= colend){
            for(int i=colst;i<=colend;i++){
                ans.add(matrix[rowst][i]);
            }
            rowst++;
            for(int i=rowst;i<=rowend;i++){
                ans.add(matrix[i][colend]);
            }
            colend--;
            if(rowst<=rowend){
                for(int i=colend;i>=colst;i--){
                    ans.add(matrix[rowend][i]);
                }
                rowend--;
            }
            if(colst <= colend){
                for(int i=rowend;i>=rowst;i--){
                    ans.add(matrix[i][colst]);
                }
                colst++;
            }
        }
        return ans;
    }
}
