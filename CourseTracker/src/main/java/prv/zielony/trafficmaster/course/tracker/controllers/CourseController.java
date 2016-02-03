package prv.zielony.trafficmaster.course.tracker.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import prv.zielony.trafficmaster.course.tracker.dto.CourseDto;
import prv.zielony.trafficmaster.course.tracker.dto.EventDto;

import java.time.LocalDateTime;

/**
 * Created by zielony on 02.02.16.
 */
@RestController
public class CourseController {

    @RequestMapping(value = "/course", produces = "application/json", consumes="application/json",
            method = RequestMethod.POST)
    public CourseDto startCourse(EventDto dto) {
        return null;
    }

    @RequestMapping(value = "/course/{id}/success", method = RequestMethod.DELETE)
    public void endCourse(@PathVariable("id") Long id) {
        ;
    }

    @RequestMapping(value = "/course/{id}/failed", method = RequestMethod.DELETE, consumes = "application/json")
    public void reportCourseFailure(EventDto dto) {
        ;
    }

    @RequestMapping(value = "/course/{courseId}/stop/{stopId}", method = RequestMethod.POST)
    public void checkInAtStop(Long courseId, Long stopId) {
        ;
    }

    @RequestMapping(value = "/course/{courseId}/delay/{minutes}", method = RequestMethod.PUT)
    public void reportDelay(@PathVariable("minutes") Long minutes) {
        ;
    }

    @RequestMapping(value = "/course/{courseId}/location", method = RequestMethod.PUT)
    public void reportLocation(@PathVariable("courseId") Long courseId, EventDto event){
        ;
    }

    @RequestMapping(value = "/course/{courseId}/detour", method = RequestMethod.PUT)
    public void reportDetour(@PathVariable("courseId") Long courseId, EventDto event) {
        ;
    }

    @RequestMapping(value = "/course/{courseId}/detour", method = RequestMethod.PUT)
    public void reportAccident(@PathVariable("courseId") Long courseId, EventDto event) {
        ;
    }

    @RequestMapping(value = "/course/{courseId}/detour", method = RequestMethod.PUT)
    public void reportTechnicalProblem(@PathVariable("courseId") Long courseId, EventDto event) {
        ;
    }
}
