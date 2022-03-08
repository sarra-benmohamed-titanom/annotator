package annotator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class AnnotatorController {
    @GetMapping("/next-text")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
