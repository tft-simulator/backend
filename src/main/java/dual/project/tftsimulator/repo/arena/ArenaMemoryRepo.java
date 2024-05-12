package dual.project.tftsimulator.repo.arena;

import dual.project.tftsimulator.model.Point;
import dual.project.tftsimulator.model.Unit;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ArenaMemoryRepo implements ArenaRepo{

    private static final Map<Point, Unit> board = new HashMap<>();

    @Override
    public Unit save(Unit unit) {
        return board.putIfAbsent(unit.getPoint(), unit);
    }

    @Override
    public Unit findById(Long id) {
        return null;
    }

    @Override
    public Unit findByName(String name) {
        return null;
    }

    @Override
    public List<Unit> findAll() {
        return null;
    }
}
