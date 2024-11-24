package src.Strategy;

public class ShippingCalculator {
    private ShippingStrategy shippingStrategy;
    ShippingCalculator(ShippingStrategy shippingStrategy){
        this.shippingStrategy=shippingStrategy;

    }

    public double calculateCost(double weight){
        return shippingStrategy.calculateCost(weight);
    }
}
