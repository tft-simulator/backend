package dual.project.tftsimulator.repo;

import dual.project.tftsimulator.model.Point;
import dual.project.tftsimulator.model.Unit;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Repository
public class ArenaMemoryRepo implements ArenaRepo{

    private static final Map<Point, Unit> board = new HashMap<>();

    @Override
    public Unit save(Unit unit) {
        return board.putIfAbsent(unit.getPoint(), unit);
    }

    @Override
    public Optional<Unit> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<Unit> findByName(String name) {
        return Optional.empty();
    }

    @Override
    public List<Unit> findAll() {
        return null;
    }
}
