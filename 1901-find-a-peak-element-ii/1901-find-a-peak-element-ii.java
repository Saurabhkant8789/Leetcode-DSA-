class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int start =0;
        int end = mat[0].length-1;
        
        
        while(start<= end){
            int mid = start +(end-start)/2;
            int maxrow = 0;
           
            for(int i =0; i<mat.length;i++){
                if(mat[i][mid] > mat[maxrow][mid]){
                    maxrow = i;
                  
                }
            }
            int left = -1;
            if(mid!=0 ){
                left = mat[maxrow][mid-1];
            }
            
            int right = -1;
            if(mid!=mat[0].length-1){
                right = mat[maxrow][mid+1];
            }
            
            if(mat[maxrow][mid] > left && mat[maxrow][mid] > right ){
                return new int [] {maxrow,mid};
            }
            else if (mat[maxrow][mid] > left){
                start = mid+1;
            }
            else end = mid-1;
            
        }
        return new int []  {-1,-1};
    }
}