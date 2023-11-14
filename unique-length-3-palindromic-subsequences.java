class Solution {
    public int countPalindromicSubsequence(String s) {
        int count = 0 ;
        Set<Character> letter = new HashSet<>();
        for(char c:s.toCharArray()){
            letter.add(c);
        }

        for(char c:letter){
            int start = s.indexOf(c);
            int end = s.lastIndexOf(c);

            if(start<end)
            {
                Set<Character> charSet = new HashSet<>();
                for(int i=start+1;i<end;i++)
                {
                    charSet.add(s.charAt(i));
                }
                count += charSet.size();
            }
        }
        return count;
    }
}
