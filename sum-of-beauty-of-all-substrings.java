class Solution {
    public int beautySum(String s) { 
        int ans=0;
        for(int i=0 ; i<s.length() ; i++){
            int arrCount[] = new int [26];
            for(int j=i ; j<s.length() ; j++){
                arrCount[s.charAt(j)-'a']++;
                ans+=sum(arrCount);
            }
        }
        return ans;
    }
    public static int sum(int arrCount[]){
        int max=0;
        int min=Integer.MAX_VALUE;
        for(int value:arrCount){
            if(value>0){
                max=Math.max(max,value);
                min=Math.min(min,value);
            }
        }
        
        return max-min;
    }
}


    
