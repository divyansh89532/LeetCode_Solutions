class Solution {
    public String reverseWords(String s) {
        String[] newStr = s.trim().split("\\s+");
        int i=0,j=newStr.length-1;
        while(i<j){
            String buffer = newStr[i];
            newStr[i]=newStr[j];
            newStr[j]=buffer;
            i++;
            j--;
        }
        return String.join(" ",newStr);

    }
}
