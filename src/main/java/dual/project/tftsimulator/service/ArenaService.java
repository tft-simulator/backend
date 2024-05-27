package dual.project.tftsimulator.service;

import dual.project.tftsimulator.model.Unit;
import dual.project.tftsimulator.model.Point;
import dual.project.tftsimulator.repo.arena.ArenaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArenaService {

    private ArenaRepo arenaRepo; // 배치판에 챔피언을 넣고 뺀다.

    @Autowired
    public ArenaService(ArenaRepo arenaRepo) {
        this.arenaRepo = arenaRepo;
    }

    public void putUnit(Unit unit) {
    }

    public Unit takeUnit(Point pos) {
        return null;
    }

    public Unit moveUnit(Unit unit, Point posToMove) {
        return null;
    }

    public Unit getUnit(Point pos) {
        return null;
    }

    public List<Unit> getAllUnits() {
        return null;
    }

    private void isValidPosition(Point pos) throws IllegalArgumentException {
        if (0 <= pos.getX() && pos.getX() < 7 && 0 <= pos.getY() && pos.getY() <= 4) {
            throw new IllegalArgumentException("존재하지 않는 지표입니다");
        }
    }
}
