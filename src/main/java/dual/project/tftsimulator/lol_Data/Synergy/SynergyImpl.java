package dual.project.tftsimulator.lol_Data.Synergy;

public class SynergyImpl implements Synergy {
    private String name;

    public SynergyImpl(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}