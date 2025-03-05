package src.systemDesign;

public class EntryExitGate {

    public void allowEntry(ParkingLot lot){
        System.out.println("vehicle attempting to enter ...");
        lot.parkVehicle();

    }

    public void allowExit(ParkingLot lot,int id){
        System.out.println("vehicle attempting to exit ...");
        lot.leaveParking(id);
    }
}
