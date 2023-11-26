class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        
        List<Integer> ans = new ArrayList<Integer>();
        int index =0;
        for (String string : words) {
            int flag=0;
            for (int i=0;i<string.length();i++) {
                if(string.charAt(i)==x)
                {
                    flag=1;
                }
            }
            if (flag==1) {
               ans.add(index); 
            }
            index++;
            }
            return ans;
        
    }
}
