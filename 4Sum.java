class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> answer = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(i>0 && nums[i-1]==nums[i])
                continue;
            for(int j=i+1;j<n;j++){
                if(j>i+1 && nums[j-1]==nums[j])
                    continue;
                int k =j+1;
                int l =n-1;
                while(k<l){
                    long sum = nums[i];
                    sum += nums[j];
                    sum += nums[k];
                    sum += nums[l];
                    if(sum<target)
                        k++;
                    else if(sum>target)    
                        l--;
                    else {
                        List<Integer> temp = Arrays.asList(nums[i],nums[j],nums[k],nums[l]);
                        answer.add(temp);
                        k++;
                        l--;
                        while(k<l && nums[k-1]==nums[k])
                        k++;
                        while(k<l && nums[l+1]==nums[l])
                        l--;
                    }   
                } 
            }    
        }
        return answer;
    }
}
