package src.LiskovPrinciple;

public class OrderClient {

    public static void main(String[] args) {
        ConnectorClass electronics= new ConnectorClass(new ElectronicsOrder());
        ConnectorClass furnitures = new ConnectorClass(new FurnitureOrder());
    }
}
