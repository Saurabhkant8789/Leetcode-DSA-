class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int startCol = 0;
        int endCol = mat[0].length - 1;
        
        while (startCol <= endCol) {
            int midCol = startCol + (endCol - startCol) / 2;
            int maxRow = 0;
            
            for (int i = 0; i < mat.length; i++) {
                if (mat[i][midCol] > mat[maxRow][midCol]) {
                    maxRow = i;
                }
            }
            
            boolean isPeak = true;
            
            if (midCol > 0 && mat[maxRow][midCol - 1] > mat[maxRow][midCol]) {
                isPeak = false;
                endCol = midCol - 1;
            } else if (midCol < mat[0].length - 1 && mat[maxRow][midCol + 1] > mat[maxRow][midCol]) {
                isPeak = false;
                startCol = midCol + 1;
            }
            
            if (isPeak) {
                return new int[]{maxRow, midCol};
            }
        }
        
        return new int[]{-1, -1}; // Should not happen as per problem statement
    }
}
