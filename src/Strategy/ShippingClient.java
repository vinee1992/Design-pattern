package src.Strategy;

public class ShippingClient {
    public static void main(String[] args) {
        ShippingStrategy normalShipping = new NormalShipping();
        ShippingCalculator normalShippingCalculator=new ShippingCalculator(normalShipping);

        System.out.println(normalShippingCalculator.calculateCost(60));
    }
}
