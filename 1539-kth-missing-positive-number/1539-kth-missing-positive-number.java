class Solution {
    public int findKthPositive(int[] arr, int k) {
        int s = 0;
        int count = 0;
        for(int i =1; i<=arr[arr.length-1]+k;i++){
            if(s<arr.length && arr[s]==i)
           {
                s++;
            }
            else count ++;
            if(count == k){
                return i;
            }
        }
        return 0;
    }
}