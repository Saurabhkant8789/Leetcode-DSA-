class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        int n = hand.length;
        if(n % groupSize !=0) return false;
        Map<Integer,Integer>mp = new TreeMap<>();
        for(int num:hand) mp.put(num, mp.getOrDefault(num,0)+1);
        while(!mp.isEmpty()){
            int cur = mp.keySet().iterator().next();
            for(int i=0;i<groupSize;i++){
                if(!mp.containsKey(cur+i)) return false;
                mp.put(cur+i, mp.get(cur+i)-1);
                if(mp.get(cur+i) == 0) mp.remove(cur+i);
            }
        }
        return true; 
    }
}