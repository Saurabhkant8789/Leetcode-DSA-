class Solution {
    public int findTheWinner(int n, int k) {
        int [] arr =  new int[n];
        int rem = n;
        for(int i =0; i<n;i++){
            arr[i] = i+1;
        }
        int j =0;
        while(rem >1){
            j = (j+k-1)%rem;
            for(int i =j; i<rem-1;i++){
                arr[i] = arr[i+1];
            }
            rem--;
                 }
        return arr[0];
    }
}