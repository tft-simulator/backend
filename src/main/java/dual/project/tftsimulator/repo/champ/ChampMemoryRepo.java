package dual.project.tftsimulator.repo.champ;

import dual.project.tftsimulator.model.Champ;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChampMemoryRepo implements ChampRepo {

    private static final Map<String, Champ> store = new HashMap<>();

    public ChampMemoryRepo() {
        save(
                new Champ("yone"),
                new Champ("yasuo"),
                new Champ("ksante")
        );
    }

    public void save(Champ champ) {
        store.put(champ.getName(), champ);
    }

    public void save(Champ... champs) {
        for(Champ champ : champs) {
            store.put(champ.getName(), champ);
        }
    }

    @Override
    public Champ findByName(String name) {
        return null;
    }

    @Override
    public List<Champ> findAll() {
        return null;
    }
}
