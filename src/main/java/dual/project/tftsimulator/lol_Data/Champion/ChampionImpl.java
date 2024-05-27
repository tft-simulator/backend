package dual.project.tftsimulator.lol_Data.Champion;

public class ChampionImpl implements Champion {
    private String name;
    private String preferredItem;
    private String synergy;

    public ChampionImpl(String name, String preferredItem, String synergy) {
        this.name = name;
        this.preferredItem = preferredItem;
        this.synergy = synergy;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getPreferredItem() {
        return preferredItem;
    }

    @Override
    public String getSynergy() {
        return synergy;
    }
}
