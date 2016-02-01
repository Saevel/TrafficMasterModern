package prv.zielony.trafficmaster.course.tracker.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import prv.zielony.trafficmaster.course.tracker.events.CourseEvent;
import prv.zielony.trafficmaster.course.tracker.events.EmbarkmentEvent;
import prv.zielony.trafficmaster.course.tracker.events.JourneyEvent;
import prv.zielony.trafficmaster.course.tracker.events.TrafficEvent;
import prv.zielony.trafficmaster.course.tracker.services.EventProcessingService;

/**
 * Created by zielony on 27.01.16.
 */
@RestController
public class EventsController {

    @Autowired
    private EventProcessingService eventProcessingService;

    @RequestMapping(value = "/course", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, method = RequestMethod.POST)
    public void publishCourseEvent(CourseEvent event) {
        //TODO: Logic

        eventProcessingService.saveEvent(event);
    }

    @RequestMapping(value = "/embarkment", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, method = RequestMethod.POST)
    public void publishEmbarkmentEvent(EmbarkmentEvent event) {
        //TODO: Logic

        eventProcessingService.saveEvent(event);
    }

    @RequestMapping(value = "/journey", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, method = RequestMethod.POST)
    public void publishJourneyEvent(JourneyEvent event) {
        //TODO: Logic

        eventProcessingService.saveEvent(event);
    }

    @RequestMapping(value = "/traffic", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, method = RequestMethod.POST)
    public void publishTrafficEvent(TrafficEvent event) {
        //TODO: Logic

        eventProcessingService.saveEvent(event);
    }
}