class Solution {
    public int mostWordsFound(String[] sentences) 
    {
        int max_len = 0;
        int[] spaces = new int[sentences.length];
        for(int i=0;i<sentences.length;i++)
        {
            int len = sentences[i].split(" ").length;
            if(max_len<len)
                max_len = len;
        }
        return max_len;     
    }
}
