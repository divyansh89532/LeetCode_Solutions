class Solution {
    public boolean closeStrings(String word1, String word2) {
        int [] word_freq1 = new int[26];
        int [] word_freq2 = new int[26];
        for (char ch:word1.toCharArray()){
            word_freq1[ch-'a']++;
        }
        for(char ch:word2.toCharArray()){
            word_freq2[ch-'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if ((word_freq1[i] == 0 && word_freq2[i] != 0) || (word_freq1[i] != 0 && word_freq2[i] == 0)) {
                return false;
            }
        }

        Arrays.sort(word_freq1);
        Arrays.sort(word_freq2);

        for (int i = 0; i < 26; i++) {
            if (word_freq1[i] != word_freq2[i]) {
                return false;
            }
        } 
        return true;
    }
}
