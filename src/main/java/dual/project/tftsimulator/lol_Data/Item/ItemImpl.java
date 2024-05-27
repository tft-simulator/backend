package dual.project.tftsimulator.lol_Data.Item;

public class ItemImpl implements Item {
    private String name;

    public ItemImpl(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}