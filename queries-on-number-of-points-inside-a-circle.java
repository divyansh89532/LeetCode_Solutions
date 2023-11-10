class Solution {

    public int distance(int[][] point,int[]query)
    {
        int counter = 0;
        for(int j=0;j<point.length;j++)
        {
            double distance = Math.sqrt((point[j][0]-query[0])*(point[j][0]-query[0])+(point[j][1]-query[1])*(point[j][1]-query[1]));
            if(distance<=query[2])
            counter++;
        }
        return counter;
    }


    public int[] countPoints(int[][] points, int[][] queries) {
        int[] count = new int[queries.length];
        for(int i=0;i<queries.length;i++)
        {
            count[i]=distance(points,queries[i]);
        }
        return count;
    }
}
