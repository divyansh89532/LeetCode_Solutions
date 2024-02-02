class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans = new ArrayList<>();
        for(int digit=1;digit<=9;++digit){
            int num = digit;
            int next_digit = digit+1;
            while(num<=high && next_digit<=9){
                num = num * 10+next_digit;
                if(num>=low && num<=high)
                    ans.add(num);
                ++next_digit;    
            }
        }
        Collections.sort(ans);
        return ans;
    }
}
