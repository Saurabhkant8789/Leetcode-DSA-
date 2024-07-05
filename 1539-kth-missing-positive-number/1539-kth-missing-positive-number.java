class Solution {
    public int findKthPositive(int[] arr, int k) {
        int start = 0;
        int end = arr.length-1;
        if(arr[0] > k){
            return k;
        }
        while(start<= end){
            int mid = start +(end -start)/2;
            if(arr[mid]-(mid+1) < k) {
                start = mid+1;
            }
            else end = mid-1;
        }
        return arr[end]+(k-(arr[end]-(end+1)));
    }
}