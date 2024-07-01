class Solution {
    public int minKBitFlips(int[] arr, int k) {
        int res=0;
        int flipCount=0;

        for(int i=0;i<arr.length;i++){
            if(i>=k && arr[i-k]==-1){
                flipCount--;
            }
            if(flipCount % 2 == arr[i]){
                if(i+k > arr.length){
                    return -1;
                }
                flipCount++;
                res++;
                arr[i] = -1;
            }
        }
        return res;
    }
}