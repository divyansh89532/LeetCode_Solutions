class Solution {
    public int max(int[]piles){
        int m = Integer.MIN_VALUE;
        for(int e:piles)
            m = Math.max(m,e);
        return m;
    }
    public int calhours(int[]piles , int rate){
        int totalhours =0;
        for(int i=0;i<piles.length;i++){
            totalhours+=Math.ceil((double) piles[i]/(double) rate);
        }
        return totalhours;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low = 0 , high = max(piles);
        while(low<=high){
            int mid =(low+high)/2;
            int calhour = calhours(piles,mid);
            if(calhour<=h) high =mid-1;
            else low=mid+1;
        }
        return low;
    }
}
