package dual.project.tftsimulator.repo.champ;

import dual.project.tftsimulator.model.Champ;
import dual.project.tftsimulator.model.Unit;

import java.util.List;

public interface ChampRepo {
    Champ findByName(String name);
    List<Champ> findAll();
}
