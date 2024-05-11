package dual.project.tftsimulator.model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Champ {
    private String name;

    public Champ(String name) {
        this.name = name;
    }
}
