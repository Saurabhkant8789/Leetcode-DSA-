class Solution {
    public boolean check(int mid,int []p,int m){
        int placed=1;
        int last=p[0];
        for(int i=0;i<p.length;i++){
            if(p[i]-last>=mid){
                placed++;
                last=p[i];
                
            }
            if(placed==m){
                    return true;
                }
            
        }
        return false;
    }
    public int maxDistance(int[] p, int m) {
        Arrays.sort(p);
        int low=1;
        int high=0;
        for(int it:p){
            high=Math.max(it,high);
        }
        int ans=1;
        while(low<=high){
            int mid=(low+high)/2;
            if(check(mid,p,m)){
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
        
    }
}
