package src.Strategy;

public class SpeedShipping implements  ShippingStrategy{
    @Override
    public double calculateCost(double weight) {
        return weight*6;
    }
}
