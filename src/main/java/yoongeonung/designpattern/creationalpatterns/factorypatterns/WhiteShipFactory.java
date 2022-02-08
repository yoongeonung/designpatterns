package yoongeonung.designpattern.creationalpatterns.factorypatterns;

public class WhiteShipFactory implements ShipFactory{

    @Override
    public Ship createShip() {
        return new WhiteShip();
    }
}
