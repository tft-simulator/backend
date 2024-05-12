package dual.project.tftsimulator.repo.arena;

import dual.project.tftsimulator.model.Unit;

import java.util.List;
import java.util.Optional;

public interface ArenaRepo {
    Unit save(Unit unit);
    Unit findById(Long id);
    Unit findByName(String name);
    List<Unit> findAll();
}
