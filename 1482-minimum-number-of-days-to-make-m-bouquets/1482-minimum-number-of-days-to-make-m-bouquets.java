class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int l = 1, r = Arrays.stream(bloomDay).max().getAsInt();
        while (r > l){
            int days = (r + l) / 2;
            if (bouquetsExists(bloomDay, m , k , days)) r = days;
            else l = days + 1;
        }
        return (bouquetsExists(bloomDay, m , k , l)) ? l : -1;
    }

    public boolean bouquetsExists(int[] bloomDay, int m, int k, int day){
        int bouquetsCount = 0, flowers = 0;
        for (int flower : bloomDay){
            if (flower <= day) {
                flowers++;
                if (flowers == k){
                    flowers = 0;
                    bouquetsCount++;
                    if (bouquetsCount == m) return true;
                }
            }
            else flowers = 0;
        }
        return false;
    }
}