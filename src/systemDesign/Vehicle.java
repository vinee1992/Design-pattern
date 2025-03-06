package src.systemDesign;

public class Vehicle {
    private String numberPlate;
    Vehicle(String numberPlate){
        this.numberPlate=numberPlate;
    }

    public String getNumberPlate(){
        return numberPlate;
    }
}
