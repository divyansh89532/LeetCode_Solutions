class Solution {
    public int maxDepth(String s) {
        int count =0;
        int operation =0 ; 
        for(char c : s.toCharArray()){
        if(c=='('){
            operation++;
        }
        if(c==')'){
            count = Math.max(count,operation);
            operation--;
        }
    }
    return count;
}
}
