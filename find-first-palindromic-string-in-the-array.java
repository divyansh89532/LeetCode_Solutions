class Solution {
    public boolean checkPalindrome(String word){
        int left = 0;
        int right = word.length()-1;
        for(int i=0;i<word.length();i++){
            if(word.charAt(left)==word.charAt(right))
            {
                left++;
                right--;
            }
            else{
                return false;
            }
        }
        return true;
    }
    public String firstPalindrome(String[] words) {
        for(String word:words){
            if(checkPalindrome(word))
                return word;
        }
        return "";
    }
}
