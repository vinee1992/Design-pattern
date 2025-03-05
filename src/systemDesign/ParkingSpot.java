package src.systemDesign;

public class ParkingSpot {
    private  int id ;
    private boolean isOccupied;

    public ParkingSpot(int id) {
        this.id = id;
        this.isOccupied = false;
    }

    public  boolean isAvaialble(){
        return !isOccupied;
    }

    public void park(){
        this.isOccupied=true;
    }

    public void leave(){
        this.isOccupied=false;
    }

    public int getId(){
        return id;
    }
}
