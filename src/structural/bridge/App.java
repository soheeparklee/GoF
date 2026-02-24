package structural.bridge;

public class App {
    public static void main(String[] args) {
        Champion championKDA = new KDA();
        championKDA.skillQ();
        championKDA.skillE();

        Champion bridgeChampion = new GardenParty(new PartySkin());
        bridgeChampion.skillQ();
        bridgeChampion.skillE();
    }
}
