class Solution {
    public boolean searchMatrix(int[][] mat, int x) {
        // code here
        for (int i=0; i<mat.length; i++){
            for (int j : mat[i]){
                if (j==x) return true;
            }
        }
        return false;
    }
}
