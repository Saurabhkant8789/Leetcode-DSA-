class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        
        int start = 1;
        int end = piles[piles.length-1];
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