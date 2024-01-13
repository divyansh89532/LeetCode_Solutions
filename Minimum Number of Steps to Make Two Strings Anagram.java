class Solution {
    public int minSteps(String s, String t) {
        int first[] = new int[26] ;
        int second[] = new int[26] ;
        int count=0;
        for(char c : s.toCharArray()){
            first[c-'a']++;
        }
        for(char c : t.toCharArray()){
            second[c-'a']++;
        }
        for(int i=0;i<26;i++)
        {
            count+=Math.abs(first[i]-second[i]);
        }
        return count/2;
    }
}
