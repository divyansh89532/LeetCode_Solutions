class Solution {

    public List<Integer> genRow(int row){
        long res = 1 ;
        List<Integer> ans = new ArrayList<>();
        ans.add(1);
        for(int i=1;i<row;i++){
            res = res*(row-i)/i;
            ans.add((int)res);
        }
        return ans;
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> answer = new ArrayList<>();
        for(int i=1;i<=numRows;i++)
        {
            answer.add(genRow(i));
        }
        return answer;
    }
}
