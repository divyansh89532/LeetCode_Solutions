class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();
        for(int i:nums){
            int freq = hm.getOrDefault(i,0)+1;
            hm.put(i,freq);
        }
        for(int key:hm.keySet()){
            if(hm.get(key)>n/3){
                ans.add(key);
            }
        }
        return ans;
    }
}
