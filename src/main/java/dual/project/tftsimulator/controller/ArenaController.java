package dual.project.tftsimulator.controller;

import dual.project.tftsimulator.model.Champ;
import dual.project.tftsimulator.model.Unit;
import dual.project.tftsimulator.model.Point;
import dual.project.tftsimulator.service.ArenaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/arena")
public class ArenaController {

    private ArenaService arenaService;

    @Autowired
    public ArenaController(ArenaService arenaService) {
        this.arenaService = arenaService;
    }

    @PostMapping //프론트 영역에 있는 배치판 관련된 로직
    public ResponseEntity<Void> putUnit(@RequestBody Unit unit) {
        //Logic
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping //프론트 영역에 있는 배치판 삭제 로직
    public ResponseEntity<Unit> moveUnit(@RequestBody Point position) {
        //Logic
        Unit dummy = new Unit(new Champ("dummy"), position);
        return new ResponseEntity<>(dummy, HttpStatus.OK);
    }
}
