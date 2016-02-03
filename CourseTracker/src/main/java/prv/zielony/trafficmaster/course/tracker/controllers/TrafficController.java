package prv.zielony.trafficmaster.course.tracker.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import prv.zielony.trafficmaster.course.tracker.dto.EventDto;

/**
 * Created by zielony on 02.02.16.
 */
@RestController("/traffic")
public class TrafficController {

    @RequestMapping(value = "/trafficjam", consumes = "application/json", method = RequestMethod.PUT)
    public void reportTrafficJam(EventDto event) {
        ;
    }

    @RequestMapping(value = "/roadworks", consumes = "application/json", method = RequestMethod.PUT)
    public void reportRoadworks(EventDto event) {
        ;
    }
}
