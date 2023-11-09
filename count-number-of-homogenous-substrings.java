class Solution {
    public int countHomogenous(String s) {
        char[] s_charArray = s.toCharArray();
        int index_first =0;
        long result =0;
        for(int i=0;i<s_charArray.length;i++)
        {
            if(s_charArray[index_first]==s_charArray[i])
            {
                result+= i-index_first+1;
            }
            else
            {
                result+=1;
                index_first = i;
            }
        }
        return (int)(result%(1000000007));

    }
}
