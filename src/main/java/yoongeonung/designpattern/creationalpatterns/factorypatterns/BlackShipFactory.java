package yoongeonung.designpattern.creationalpatterns.factorypatterns;

public class BlackShipFactory implements ShipFactory {

    @Override
    public Ship createShip() {
        return new BlackShip();
    }
}
