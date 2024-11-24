package src.LiskovPrinciple;

public class ElectronicsOrder implements  IOrder{

    @Override
    public void process() {
        System.out.println("Ordering Electronics items");
    }
}
