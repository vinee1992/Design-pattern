package src.systemDesign;

public class TestingClass {
    public static void main(String[] args) {


        ParkingLot lot = new ParkingLot(3);
        EntryExitGate gate =new EntryExitGate();
        gate.allowEntry(lot);
        gate.allowEntry(lot);
        gate.allowEntry(lot);
        gate.allowExit(lot,2);
        gate.allowEntry(lot);
    }

}
