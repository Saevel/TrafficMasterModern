package prv.zielony.trafficmaster.course.tracker.dto;

import prv.zielony.trafficmaster.course.tracker.model.Location;

import java.util.Date;

/**
 * Created by zielony on 03.02.16.
 */
public class EventDto {

    private Location location;

    private Date timestamp;

    public EventDto() {
    }

    public EventDto(Location location, Date timestamp) {
        this.location = location;
        this.timestamp = timestamp;
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
}