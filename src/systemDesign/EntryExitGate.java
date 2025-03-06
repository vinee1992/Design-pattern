package src.systemDesign;

public class EntryExitGate {

    public void allowEntry(ParkingLot lot,Vehicle vehicle){
        System.out.println("vehicle " + vehicle.getNumberPlate()+ " attempting to enter ...");
        lot.parkVehicle(vehicle);

    }

    public void allowExit(ParkingLot lot,int id){
        System.out.println("vehicle attempting to exit ...");
        lot.leaveParking(id);
    }
}
