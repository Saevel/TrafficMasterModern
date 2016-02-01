package prv.zielony.trafficmaster.course.tracker.health;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class VersionController {

    @RequestMapping("/version")
    public String version() {
        return "1.0";
    }
}
