class Solution {

    public int calculate(int[] weights,int capacity){
        int sum= 0;
        int day =1;
        for(int i:weights){
            if(sum+i>capacity){
                day++;
                sum=i;
            }
            else{
                sum+=i;
            }
        }
        return day;
    }
    public int shipWithinDays(int[] weights, int days) {
        int maxi= Integer.MIN_VALUE;
        int sum=0;
        for(int i:weights){
            maxi=Math.max(maxi,i);
            sum+=i;
        }
        int low=maxi,high=sum;
        while(low<=high){
            int mid = (low+high)/2;
            if(calculate(weights,mid)<=days){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}
