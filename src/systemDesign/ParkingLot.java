package src.systemDesign;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private List<ParkingSpot> spots;

    public ParkingLot(int capacity) {
        this.spots = new ArrayList<>();
        for(int i=1;i<=capacity;i++){
            spots.add(new ParkingSpot(i));
        }
    }

    public boolean parkVehicle(Vehicle vehicle){
        for(ParkingSpot spot : spots){
            if(spot.isAvaialble()){
               return spot.park(vehicle);
            }
        }
        System.out.println("No available spots for vehicle  ." + vehicle.getNumberPlate());
        return false;
    }

    public boolean leaveParking(int spotId){
        for(ParkingSpot spot: spots){
            if(spot.getId()==spotId && !spot.isAvaialble()){
                spot.leave();
                System.out.println("spot " + spotId + "is free Now.");
                return true;

            }
        }
        System.out.println("Invalid spot or already Empty . ");
        return false;
    }

}
