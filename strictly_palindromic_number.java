class Solution {
    public boolean isStrictlyPalindromic(int n) {
        String number_string = Integer.toString(n);
        int flag =0;
        for(int i=2;i<=n-2;i++)
        {
            String num_base_string = Integer.toString(Integer.parseInt(number_string,10),i);
            StringBuilder sb = new StringBuilder();
            sb.append(num_base_string);
            sb.reverse();
            if(sb.equals(num_base_string.toString()))
                flag=1;
            else
                flag=0;                    
        }
        if(flag==1)
            return true;
        return false;
    }
}
