package dual.project.tftsimulator.model;

import lombok.Data;

@Data
public class Unit {
    private Champ unit;
    private Point point;

    public Unit(Champ champ, Point position) {
        this.unit = champ;
        this.point = position;
    }
}
