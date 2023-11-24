class Solution {
    public String restoreString(String s, int[] indices) {
        char[] dummy = new char[s.length()];
        for(int i=0;i<indices.length;i++)
        {
            dummy[indices[i]]=s.charAt(i);
        }
        StringBuilder final_ans = new StringBuilder();
        for (Character character : dummy) {
            final_ans.append(character);
        }
        return final_ans.toString();
    }
}
