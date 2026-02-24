package structural.bridge;

public class DefaultChampion implements Champion{
    private Skin skin;
    private String championName;

    public DefaultChampion(Skin skin, String championName) {
        this.skin = skin;
        this.championName = championName;
    }

    @Override
    public void move() {
        System.out.printf("%s %s move \n", skin.getChampionName(), this.championName);
    }

    @Override
    public void skillQ() {
        System.out.printf("%s %s Q \n", skin.getChampionName(), this.championName);

    }

    @Override
    public void skillW() {
        System.out.printf("%s %s W \n", skin.getChampionName(), this.championName);

    }

    @Override
    public void skillE() {
        System.out.printf("%s %s E \n", skin.getChampionName(), this.championName);

    }

    @Override
    public void skillR() {
        System.out.printf("%s %s R \n", skin.getChampionName(), this.championName);

    }
}
