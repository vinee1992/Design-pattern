package src.Strategy;

public class NormalShipping implements ShippingStrategy{
    @Override
    public double calculateCost(double weight) {
        return weight*2;
    }
}
