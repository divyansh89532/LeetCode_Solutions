class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String search;
        for(int i=1;i<=s.length()/2;i++)
        {
            String sub = "";
            search = s.substring(0,i);
            int factor = s.length()/search.length();
            sub = search.repeat(factor);
            if(sub.equals(s))
            return true;
        }
        return false;
    }
}
