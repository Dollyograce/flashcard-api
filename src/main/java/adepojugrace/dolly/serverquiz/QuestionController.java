package adepojugrace.dolly.serverquiz;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/question")
@Slf4j
public class QuestionController {
    @PostMapping("/")
    public ResponseEntity<String> create(@RequestBody Question question){
        log.info(question.toString());
        return null;
    }
}
