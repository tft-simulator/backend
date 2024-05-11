package dual.project.tftsimulator.repo;

import dual.project.tftsimulator.model.Unit;

import java.util.List;
import java.util.Optional;

public interface ArenaRepo {
    Unit save(Unit unit);
    Optional<Unit> findById(Long id);
    Optional<Unit> findByName(String name);
    List<Unit> findAll();
}
