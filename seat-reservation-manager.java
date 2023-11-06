class SeatManager {
    PriorityQueue<Integer> seats =new PriorityQueue<Integer>();
    public SeatManager(int n) {
        for(int i=1;i<=n;i++)
        {
            seats.add(i);
        }     
    }
    
    public int reserve() {
        if(seats.isEmpty())
        {
            return -1;
        }
        else{
            int reserved = seats.poll();
            return reserved;
        }
    }
    
    public void unreserve(int seatNumber) {
        seats.offer(seatNumber);
    }
}

/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */
