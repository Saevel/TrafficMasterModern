package prv.zielony.trafficmaster.course.tracker.events;

import prv.zielony.trafficmaster.course.tracker.model.Location;

/**
 * Created by zielony on 27.01.16.
 */
public class CourseEvent extends Event {

    private Long courseId;

    private Long driverId;

    private Location location;
}
