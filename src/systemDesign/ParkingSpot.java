package src.systemDesign;

public class ParkingSpot {
    private  int id ;
    private boolean isOccupied;
    private Vehicle vehicle;

    public ParkingSpot(int id) {
        this.id = id;
        this.isOccupied = false;
        this.vehicle = null;
    }

    public  boolean isAvaialble(){
        return !isOccupied;
    }

    public boolean park(Vehicle vehicle){
        if(isOccupied) return false;
        this.vehicle=vehicle;
        this.isOccupied=true;
        System.out.println("Vehicle" + vehicle.getNumberPlate() + " parked at spot " + id);
        return true;
    }

    public boolean leave(){

//if(!isOccupied) return false;
        System.out.println("Vehicle" + vehicle.getNumberPlate() + " left  spot " + id);
        this.vehicle=null;
        this.isOccupied=false;
        return true;

    }

    public int getId(){
        return id;
    }
}
