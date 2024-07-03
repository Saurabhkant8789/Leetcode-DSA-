class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       int max = piles[0];
        for(int i =1; i<piles.length;i++){
            if(piles[i] > piles[0]){
                max = piles[i];
            }
        }
        
        int start = 1;
        int end = max;
        while(start<=end){
            int mid = start + (end-start)/2;
            // if(caneat(piles,mid)==h){
            //     return mid;
            // }      
           if(caneat(piles,mid)<=h){
                end = mid-1;
            }
            else start = mid+1;
        }
        return start;
    }
    
    private int caneat (int[] piles , int mid){
        int sum =0;
        for(int i =0; i<piles.length;i++){
            sum += Math.ceil((double)(piles[i]) / (double)(mid));;
            
        }
        return sum;
    }
}