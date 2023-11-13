class Solution {
    public String sortVowels(String s) {
        ArrayList<Character> vowels = new ArrayList<Character>();

        for(char c:s.toCharArray())
        {
            if("aeiouAEIOU".indexOf(c)!=-1)
            vowels.add(c);
        }
        Collections.sort(vowels);
        int index = 0 ; 
        StringBuilder ans = new StringBuilder();
        for (char c:s.toCharArray()) {
            if("aeiouAEIOU".indexOf(c)!=-1)
            {
                ans.append(vowels.get(index));
                index++;
            } 
            else
            {
                ans.append(c);
            } 
        }
        return ans.toString();
    }
}
