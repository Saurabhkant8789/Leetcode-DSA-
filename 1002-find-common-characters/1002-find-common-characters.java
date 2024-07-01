class Solution {
    public List<String> commonChars(String[] words) {
        List<String> answer = new ArrayList<>();
        int [] currentCounts = new int [26];
        int [] commonCounts = new int[26];
        for(char ch: words[0].toCharArray()) { commonCounts[ch-'a']++; }
        for(String word: words) {
            Arrays.fill(currentCounts, 0);
            for(char ch: word.toCharArray()) {
                currentCounts[ch - 'a']++;
            }
            for(int i = 0; i<26; i++) {
                commonCounts[i] = Math.min(commonCounts[i], currentCounts[i]);
            }
        }
        for(int i = 0; i<26; i++) {
            while(commonCounts[i] != 0) {
                answer.add(String.valueOf((char)(i+'a')));
                commonCounts[i]--;
            }
        }
        return answer;
    }
}