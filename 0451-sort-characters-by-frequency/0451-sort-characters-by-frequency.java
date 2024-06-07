class Solution {
    public String frequencySort(String s) {
        String ans = "";
        int[] count = new int[128]; 
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++; 
        }
        for (int i = 0; i < s.length(); i++) {
            char c = frequency(count);
            for (int j = 0; j < count[c]; j++) {
                ans = ans + c;
            }
            count[c] = 0;
        }
        return ans;
    }

    public static char frequency(int[] sau) {
        int index = 0;
        int max = sau[0];
        for (int i = 1; i < sau.length; i++) {
            if (max < sau[i]) {
                max = sau[i];
                index = i;
            }
        }
        return (char) index;
    }
}
