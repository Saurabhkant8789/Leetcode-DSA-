class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int store = 0;
        List<Boolean> ans = new ArrayList<>();
        int max = -1;
        int i = 0;
        while (i<candies.length){
            if (candies[i]> max)
                max = candies[i];
            i++;
        }
        
        for (i=0; i<candies.length ;i++){
            store = candies [i] + extraCandies;
            if(store>=max)
                ans.add(true);
            else ans.add(false);
        }
        return ans;
    }
}