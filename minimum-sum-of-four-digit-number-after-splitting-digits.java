class Solution {
    public int minimumSum(int num) {
        int[] digits = new int[4];
        int index = 0;
        while(num>0)
        {
            int dig = num % 10;
            num = num/10;
            digits[index] = dig;
            index ++;
        }
        Arrays.sort(digits);
        int first = digits[0]*10 + digits[2];
        int second = digits[1]*10 + digits[3];
        return (first + second);
    }
}
