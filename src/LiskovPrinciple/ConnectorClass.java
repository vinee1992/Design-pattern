package src.LiskovPrinciple;

public class ConnectorClass {

    public ConnectorClass(IOrder iOrder){
        iOrder.process();
    }
}
