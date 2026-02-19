package factory;

public class Client {
    public static void main(String[] args) {
        Ship whiteShip = new WhiteShipFactory().orderShip("WhiteShip", "aaa@gmail.com");
        Ship blackShip = new BlackShipFactory().orderShip("BlackShip", "bbb@gmail.com");
    }
}
