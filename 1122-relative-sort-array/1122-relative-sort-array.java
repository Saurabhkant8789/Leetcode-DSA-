class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        
        
        int [] ans = new int [arr1.length];
        int x =0;
        for(int i =0; i<arr2.length;i++){
            for(int j=0; j<arr1.length;j++){
                
                if(arr2[i] == arr1[j]){
                    ans[x] = arr1[j];
                    x++;
                    arr1[j] = -1;
                }
                
            }
        }
        Arrays.sort (arr1);
        for(int i=0; i<arr1.length; i++){
            if(arr1[i]!= -1){
                ans[x] = arr1[i];
                x++;
            }
        }
        return ans;
        
    }
}