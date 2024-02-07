class Solution {
    static class Pair{
        char k;
        int val;
        Pair(char k,int val){
            this.k = k;
            this.val = val;
        }
        
    }
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
            else{
                map.put(s.charAt(i),1);
            }
        }
        ArrayList<Pair> list = new ArrayList<>();
        for(Map.Entry<Character,Integer> entry:map.entrySet() ){
            list.add(new Pair(entry.getKey(), entry.getValue()));
        }
        Collections.sort(list,(a,b)->b.val-a.val);
        StringBuilder sb = new StringBuilder();
        for(Pair pair : list){
            char ch = pair.k;
            int freq = pair.val;
            for(int i=0;i<freq;i++){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
