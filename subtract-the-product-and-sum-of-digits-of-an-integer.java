class Solution {
    public int subtractProductAndSum(int n) {
        int sum =0;
        int multiply =1;
        while(n>0)
        {
            int digit = n%10;
            n = n/10;
            multiply = multiply * digit;
            sum = sum + digit;
        }
        return (multiply - sum); 
    }
}
