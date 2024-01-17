class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap <Integer,Integer> hm = new HashMap<>();
        int max_count =1;
        for(int i=0;i<nums.length;i++)
        {
            int key = nums[i];
            int freq =1;
            if(hm.containsKey(nums[i])){
                freq = hm.get(key);
                freq++;
            }
            hm.put(nums[i],freq);
            if(freq>max_count)
            {
                max_count=freq;
            }
        }
        
        int max_int = 0;
        for(int i:hm.keySet()){
            int freq = hm.get(i);
            if(freq==max_count)
                max_int+=freq;
        }
        return max_int;
    }
}
