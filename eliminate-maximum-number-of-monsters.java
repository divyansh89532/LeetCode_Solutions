class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        int[] time = new int[dist.length];
        for(int i=0;i<dist.length;i++)
        {
            time[i] = (int) Math.ceil((double) dist[i]/speed[i]);
        }
        Arrays.sort(time);
        int time_elapsed = 0 ; 
        for(int j=0;j<dist.length;j++)
        {   
            if(time_elapsed>=time[j])
            {
                return time_elapsed;
            }
            time_elapsed++;
        }
        return dist.length;
    }
}
