package battleship3;

/**
 *
 * @author Brandon
 */
public class StartUp {
    public static void main(String[] args) {
        Coordinate test = new Coordinate("B15");
        System.out.println(test.getBattleShipString());
        System.out.println(test.getX());
        System.out.println(test.getY());
        System.out.println(test.getRow());
        System.out.println(test.getCol());
    }
}
