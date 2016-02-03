package prv.zielony.trafficmaster.course.tracker.dto;

import java.util.Collection;
import java.util.LinkedList;

/**
 * Created by zielony on 03.02.16.
 */
public class CourseDto {

    Long courseId;

    Collection<StopDto> stops = new LinkedList<StopDto>();

    public CourseDto() {
    }

    public CourseDto(Long courseId, Collection<StopDto> stops) {
        this.courseId = courseId;
        this.stops = stops;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public Collection<StopDto> getStops() {
        return stops;
    }

    public void setStops(Collection<StopDto> stops) {
        this.stops = stops;
    }
}