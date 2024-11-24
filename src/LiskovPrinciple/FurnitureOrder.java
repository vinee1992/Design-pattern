package src.LiskovPrinciple;

public class FurnitureOrder implements IOrder{
    @Override
    public void process() {
        System.out.println("Ordering Furniture Items");
    }
}
