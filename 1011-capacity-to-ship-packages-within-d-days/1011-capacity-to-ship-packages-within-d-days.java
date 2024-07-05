class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int start = 1;
        int end = 0;
            for(int i =0; i<weights.length;i++){
            if(start < weights[i]){
                start = weights[i];
            }
        }
        for(int i=0; i<weights.length;i++){
            end = end + weights[i];
        }
        while(start<= end){
            int mid = start+(end-start)/2;
            if(count(weights,mid) > days){
                start = mid+1;
            }
            else end = mid-1;
        }  
        return start;
    }
    
    public int count (int[] w, int mid){
        int sum =0;
        int count = 0;
        for(int i =0; i<w.length;i++){
            sum = sum + w[i];
            if(sum > mid){
                count++;
                sum = w[i];
            }
        }
        return count+1;
    }
}