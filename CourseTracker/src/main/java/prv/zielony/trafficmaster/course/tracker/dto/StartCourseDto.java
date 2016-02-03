package prv.zielony.trafficmaster.course.tracker.dto;

import prv.zielony.trafficmaster.course.tracker.model.Location;

import java.util.Date;

/**
 * Created by zielony on 03.02.16.
 */
public class StartCourseDto {

    private Location location;

    private Date timestamp;

    private Long lineId;

    public StartCourseDto() {
    }

    public StartCourseDto(Location location, Date timestamp, Long lineId) {
        this.location = location;
        this.timestamp = timestamp;
        this.lineId = lineId;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public Long getLineId() {
        return lineId;
    }

    public void setLineId(Long lineId) {
        this.lineId = lineId;
    }
}