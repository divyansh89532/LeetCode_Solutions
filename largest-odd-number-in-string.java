class Solution {
    public String largestOddNumber(String num) {
       String ans="";
       int i=num.length()-1;
       while(i>=0){
            if(num.charAt(i)%2!=0){
                ans=num.substring(0,i+1);
                break;
            }
            else{
                i--;
            }
       } 
       return ans;
    }
}
