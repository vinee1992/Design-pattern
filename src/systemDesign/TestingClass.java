package src.systemDesign;

public class TestingClass {
    public static void main(String[] args) {


        ParkingLot lot = new ParkingLot(3);
        EntryExitGate gate =new EntryExitGate();
        Vehicle v1= new Vehicle("TN14F7756");
        Vehicle v2= new Vehicle("TN14F7750");
        gate.allowEntry(lot,v1);
        gate.allowEntry(lot,v2);
        gate.allowExit(lot,2);
    }

}
