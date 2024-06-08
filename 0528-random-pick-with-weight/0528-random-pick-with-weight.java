class Solution {
    final TreeMap<Double, Integer> map = new TreeMap<>();
    final Random rand = new Random();

    public Solution(int[] w) {
        int s = 0;
        for (int num : w) s += num;

        double acc = 0.0;
        for (int i = 0; i < w.length; i ++) map.put(acc += (double) w[i] / s, i);
    }

    public int pickIndex() {
        double random = rand.nextDouble(1.0);
        return map.getOrDefault(random, map.higherEntry(random).getValue());
    }
}