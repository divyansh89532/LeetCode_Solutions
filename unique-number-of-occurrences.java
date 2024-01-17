class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        HashSet<Integer> hs = new HashSet<>();
        for(int i:arr)
        {
            int key = i;
            int freq = 1 ;
            if(hm.containsKey(key))
            {
                freq = hm.get(key);
                freq++;
                hm.put(key,freq);
            }
            hm.put(key,freq);
        }
        hs.addAll(hm.values());
        return(hs.size()==hm.values().size());
    }
}
