class ParkingSystem {

    private int big_parking ;
    private int med_parking ;
    private int sm_parking ;

    public ParkingSystem(int big, int medium, int small) {
        big_parking=big;
        med_parking=medium;
        sm_parking=small;
    }
    
    public boolean addCar(int carType) {
        if(carType==1 && big_parking>0)
        {
            big_parking--;
            return true;
        }
        else if(carType==2 && med_parking>0){
            med_parking--;
            return true;
        }
        else if(carType==3 && sm_parking>0){
            sm_parking--;
            return true;
        }
        return false;    
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */
